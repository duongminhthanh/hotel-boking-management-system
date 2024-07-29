package org.example.backend.service;

import org.example.backend.dto.request.CRequestUser;
import org.example.backend.dto.request.RequestLogin;
import org.example.backend.dto.response.DResponseUser;

import java.util.List;

public interface IUser {
    DResponseUser register(CRequestUser requestUser);

    DResponseUser login(RequestLogin requestLogin);

    List<DResponseUser> getAllUsers();

    DResponseUser getUserBookingHistory(String userId);

    DResponseUser deleteUser(String userId);

    DResponseUser getUserById(String userId);

    DResponseUser getMyInfo(String email);
}
