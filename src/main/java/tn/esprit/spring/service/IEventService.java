package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Event;

public interface IEventService {

	public Event addOrUpdate(Event event);

	public void delete(int id);

	public List<Event> list();

	public Event findById(int id);

	public void affectEventToKG(int idKG, int idEvent);

	public void desaffectEvent(int idKG, int idEvent);

}
