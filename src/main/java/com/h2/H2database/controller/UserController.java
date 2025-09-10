package com.h2.H2database.controller;

import com.h2.H2database.Entity.My_User;
import com.h2.H2database.dto.UserRequest;
import com.h2.H2database.dto.UserResponse;
import com.h2.H2database.repository.Userreposit;
import com.h2.H2database.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    private UserService service;
    @PostMapping ("/save")
    public ResponseEntity<UserResponse> saveemp(@Valid @RequestBody UserRequest user)
        {
        return service.saveuser(user);
}
}
