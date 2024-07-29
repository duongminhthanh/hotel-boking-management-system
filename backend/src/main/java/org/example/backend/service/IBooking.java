package org.example.backend.service;

import org.example.backend.dto.response.DResponseBooking;
import org.example.backend.entities.Booking;

import java.util.List;

public interface IBooking {
    DResponseBooking saveBooking(Long roomId, Long userId, Booking bookingRequest);

    DResponseBooking findBookingByConfirmationCode(String confirmationCode);

    List<DResponseBooking> getAllBookings();

    DResponseBooking cancelBooking(Long bookingId);
}
