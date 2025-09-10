package com.h2.H2database.service;

import com.h2.H2database.Entity.My_User;
import com.h2.H2database.dto.UserRequest;
import com.h2.H2database.dto.UserResponse;
import com.h2.H2database.mapper.UserMapper;
import com.h2.H2database.mapper.UserMapstruct;
import com.h2.H2database.repository.Userreposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceimplementation implements UserService {
    @Autowired
    private Userreposit repo;
    @Autowired
    private UserMapstruct mapstruct;
    @Override
    public ResponseEntity<UserResponse> saveuser(UserRequest user) {
//        My_User userdata = UserMapper.toEntity(user);
//        My_User empl = repo.save(userdata);
//        UserResponse responsedto=UserMapper.toUserResponseDto(empl);
        My_User userdata = mapstruct.toEntity(user);
        My_User empl = repo.save(userdata);
        UserResponse responsedto=mapstruct.toUserResponseDto(empl);
        return ResponseEntity.status(HttpStatus.CREATED).body(responsedto);
    }
}
