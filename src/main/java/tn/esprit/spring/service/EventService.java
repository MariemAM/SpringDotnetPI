package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.repository.EventRepository;
import tn.esprit.spring.repository.KGRepository;

@Service
public class EventService implements IEventService {

	@Autowired
	EventRepository repository;

	@Autowired
	KGRepository kgrepository;

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
	public boolean participate(int idUser, int idEvent, int idKG) {
		// TODO Auto-generated method stub
		Event event=repository.findById(idEvent).get();
		
		return false;
	}

}
