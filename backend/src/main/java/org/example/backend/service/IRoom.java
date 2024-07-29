package org.example.backend.service;

import org.example.backend.dto.response.DResponseRoom;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IRoom {
    DResponseRoom addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice, String description);

    List<DResponseRoom> getAllRoomTypes();

    List<DResponseRoom> getAllRooms();

    DResponseRoom deleteRoom(Long roomId);

    DResponseRoom updateRoom(Long roomId, String description, String roomType, BigDecimal roomPrice, MultipartFile photo);

    DResponseRoom getRoomById(Long roomId);

    DResponseRoom getAvailableRoomsByDataAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    DResponseRoom getAllAvailableRooms();

}
