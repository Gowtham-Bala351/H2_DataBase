package com.h2.H2database.service;

import com.h2.H2database.Entity.My_User;
import com.h2.H2database.dto.UserRequest;
import com.h2.H2database.dto.UserResponse;
import org.springframework.http.ResponseEntity;

public interface UserService
{

    ResponseEntity<UserResponse> saveuser(UserRequest user);
}
