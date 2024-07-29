package org.example.backend.dto.request;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class CRequestBooking {
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuest;
    private Long userId;
    private Long roomId;
}
