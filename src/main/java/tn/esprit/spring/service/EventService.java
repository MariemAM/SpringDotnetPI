package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import tn.esprit.spring.entities.*;
import tn.esprit.spring.repository.EventRepository;
import tn.esprit.spring.repository.KGRepository;
import tn.esprit.spring.repository.KidRepository;
import tn.esprit.spring.repository.ParticipationRepository;

@Service
public class EventService implements IEventService {

	@Autowired
	EventRepository repository;

	@Autowired
	KGRepository kgrepository;

	@Autowired
	KidRepository kidrepository;
	@Autowired
	ParticipationRepository paticipaterepository;

	@Override
	public Event addOrUpdate(Event event) {
		// TODO Auto-generated method stub
		return repository.save(event);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Event findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(new Event());
	}

	@Override
	public List<Event> list() {
		// TODO Auto-generated method stub
		return (List<Event>) repository.findAll();
	}

	@Override
	public void affectEventToKG(int idKG, int idEvent) {
		// TODO Auto-generated method stub
		repository.affectEventToKG(idKG, idEvent);
	}

	@Override
	public void desaffectEventToKG(int idKG, int idEvent) {
		// TODO Auto-generated method stub
		repository.desaffectEventToKG(idKG, idEvent);
	}

	@Override
	public boolean participate(int idKid, int idEvent, int idKG) {
		// TODO Auto-generated method stub
		KinderGarten kg=kgrepository.findById(idKG).get();
		InscriptionKid kid=kidrepository.findById(idKid).get();
		Event event=repository.findById(idEvent).get();
		Participation test=paticipaterepository.findById(new ParticipationFK(idKid,idEvent)).get();
		if(!ObjectUtils.isEmpty(kg) && !ObjectUtils.isEmpty(kid))
			return false;
		else
		if(!kg.getInscriptionKids().contains(kid))//1
			return false;
		else
		if(!ObjectUtils.isEmpty(test))//3
			return false;
		else
		if ((event.getMax_number()-event.getNbrparticipants())>0 )//2
			paticipaterepository.participate(idEvent, idKid);
		   event.setNbrparticipants(event.getNbrparticipants()-1);
		   repository.save(event);
		   return true;
	}

}
