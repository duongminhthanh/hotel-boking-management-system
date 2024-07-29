package org.example.backend.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.backend.dto.response.DResponseRoom;
import org.example.backend.repository.RoomRepository;
import org.example.backend.service.IRoom;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class RoomService implements IRoom {
    private final RoomRepository roomRepository;
    @Override
    public DResponseRoom addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice, String description) {
        return null;
    }

    @Override
    public List<DResponseRoom> getAllRoomTypes() {
        return null;
    }

    @Override
    public List<DResponseRoom> getAllRooms() {
        return null;
    }

    @Override
    public DResponseRoom deleteRoom(Long roomId) {
        return null;
    }

    @Override
    public DResponseRoom updateRoom(Long roomId, String description, String roomType, BigDecimal roomPrice, MultipartFile photo) {
        return null;
    }

    @Override
    public DResponseRoom getRoomById(Long roomId) {
        return null;
    }

    @Override
    public DResponseRoom getAvailableRoomsByDataAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType) {
        return null;
    }

    @Override
    public DResponseRoom getAllAvailableRooms() {
        return null;
    }
}
