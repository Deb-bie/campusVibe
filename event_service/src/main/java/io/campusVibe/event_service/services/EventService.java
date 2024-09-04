package io.campusVibe.event_service.services;

import io.campusVibe.event_service.dtos.ResponseHandler;
import io.campusVibe.event_service.dtos.requests.AddEventRequest;
import io.campusVibe.event_service.entities.Event;
import io.campusVibe.event_service.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public ResponseEntity<ResponseHandler> addEvent(AddEventRequest addEventRequest){
        Event newEvent = Event.builder()
                .name(addEventRequest.getName())
                .location(addEventRequest.getLocation())
                .date(addEventRequest.getDate())
                .time(addEventRequest.getTime())
                .organiser(addEventRequest.getOrganiser())
                .build();
        eventRepository.save(newEvent);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ResponseHandler.builder()
                        .message("successful")
                        .status(HttpStatus.CREATED)
                        .statusCode(201)
                        .build());
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
