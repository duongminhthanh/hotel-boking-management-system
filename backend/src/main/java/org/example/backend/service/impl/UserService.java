package org.example.backend.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.backend.dto.request.CRequestUser;
import org.example.backend.dto.request.RequestLogin;
import org.example.backend.dto.response.DResponseUser;
import org.example.backend.repository.UserRepository;
import org.example.backend.service.IUser;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService implements IUser {
    private final UserRepository userRepository;
    @Override
    public DResponseUser register(CRequestUser requestUser) {
        return null;
    }

    @Override
    public DResponseUser login(RequestLogin requestLogin) {
        return null;
    }

    @Override
    public List<DResponseUser> getAllUsers() {
        return null;
    }

    @Override
    public DResponseUser getUserBookingHistory(String userId) {
        return null;
    }

    @Override
    public DResponseUser deleteUser(String userId) {
        return null;
    }

    @Override
    public DResponseUser getUserById(String userId) {
        return null;
    }

    @Override
    public DResponseUser getMyInfo(String email) {
        return null;
    }
}
