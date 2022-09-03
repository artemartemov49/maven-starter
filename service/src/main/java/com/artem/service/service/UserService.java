package com.artem.service.service;

import com.artem.database.dao.UserDao;
import com.artem.service.dto.UserDto;
import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(1L)
            .map(it -> new UserDto());
    }
}
