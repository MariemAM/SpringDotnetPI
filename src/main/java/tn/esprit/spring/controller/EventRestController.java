package tn.esprit.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Event;
import tn.esprit.spring.service.IEventService;

@RestController
@RequestMapping(path = "/event")
public class EventRestController {

	@Autowired
	IEventService eventservice;

	@GetMapping("/getall")
	public List<Event> list() {
		List<Event> list = eventservice.list();
		return list;
	}

	@PostMapping("/add")
	public Event addEvent(@RequestBody Event e) {
		Event Event = eventservice.addOrUpdate(e);
		return Event;
	}

	@DeleteMapping("/remove/{Event-id}")
	public void removeEvent(@PathVariable("Event-id") int EventId) {
		eventservice.delete(EventId);
	}

	@PutMapping("/modify")
	public Event modifyEvent(@RequestBody Event event) {
		return eventservice.addOrUpdate(event);
	}

	@GetMapping("/get/{Event-id}")
	public Event retrieveEvent(@PathVariable("Event-id") int EventId) {
		return eventservice.findById(EventId);
	}

	@PutMapping(value = "/affectEventToKG/{idKG}/{idEvent}")
	public void affectEventToKG(@PathVariable("idKG") int idKG, @PathVariable("idEvent") int idEvent) {
		eventservice.affectEventToKG(idKG, idEvent);
	}
	@PutMapping(value = "/desaffectEvent/{idKG}/{idEvent}")
	public void desaffectEvent(@PathVariable("idKG") int idKG, @PathVariable("idEvent") int idEvent) {
		eventservice.desaffectEventToKG(idKG, idEvent);;
	}
	@PostMapping("/participate/{idevent}/{idkg}/{idkid}")
	public void addEvent(@PathVariable("idevent") int idEvent, @PathVariable("idkg") int idKG,@PathVariable("idkid") int idkid) {
		eventservice.participate(idkid, idEvent, idKG);
	}

	
}
