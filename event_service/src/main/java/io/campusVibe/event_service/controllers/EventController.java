package io.campusVibe.event_service.controllers;

import io.campusVibe.event_service.dtos.ResponseHandler;
import io.campusVibe.event_service.dtos.requests.AddEventRequest;
import io.campusVibe.event_service.services.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {
    private EventService eventService;

    @PostMapping("/add")
    public ResponseEntity<ResponseHandler> addEvent(@RequestBody AddEventRequest addEventRequest){
        return eventService.addEvent(addEventRequest);
    }

    public void updateEvent() {

    }

    public void deleteEvent() {

    }

    public void getAllEvents() {

    }

    public void getEventById() {

    }
}
