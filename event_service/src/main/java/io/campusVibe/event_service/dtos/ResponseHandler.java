package io.campusVibe.event_service.dtos;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ResponseHandler {
    private Integer statusCode;
    private HttpStatus status;
    private String message;
}
