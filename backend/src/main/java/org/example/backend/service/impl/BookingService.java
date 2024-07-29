package org.example.backend.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.backend.dto.response.DResponseBooking;
import org.example.backend.entities.Booking;
import org.example.backend.repository.BookingRepository;
import org.example.backend.service.IBooking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService implements IBooking {
    private final BookingRepository bookingRepository;

    @Override
    public DResponseBooking saveBooking(Long roomId, Long userId, Booking bookingRequest) {
        return null;
    }

    @Override
    public DResponseBooking findBookingByConfirmationCode(String confirmationCode) {
        return null;
    }

    @Override
    public List<DResponseBooking> getAllBookings() {
        return null;
    }

    @Override
    public DResponseBooking cancelBooking(Long bookingId) {
        return null;
    }
}
