package io.campusVibe.event_service.entities;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "event")
@Builder
@Data
public class Event {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    private String location;

    private LocalDate date;

    private LocalTime time;

    private String organiser;

    private Long rsvps;
}
