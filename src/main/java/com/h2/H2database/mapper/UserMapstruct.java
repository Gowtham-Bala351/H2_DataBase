package com.h2.H2database.mapper;

import com.h2.H2database.Entity.My_User;
import com.h2.H2database.dto.UserRequest;
import com.h2.H2database.dto.UserResponse;
import org.mapstruct.Mapper;
//way 2
@Mapper(componentModel = "spring")
public interface UserMapstruct
{
     My_User toEntity(UserRequest userreq);
     UserResponse toUserResponseDto(My_User user);
}
