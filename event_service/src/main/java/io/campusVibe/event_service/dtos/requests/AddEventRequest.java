package io.campusVibe.event_service.dtos.requests;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@RequiredArgsConstructor
public class AddEventRequest {
    private String name;
    private String location;
    private LocalDate date;
    private LocalTime time;
    private String organiser;
}
