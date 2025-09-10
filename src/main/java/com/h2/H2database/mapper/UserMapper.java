package com.h2.H2database.mapper;

import com.h2.H2database.Entity.My_User;
import com.h2.H2database.dto.UserRequest;
import com.h2.H2database.dto.UserResponse;
//way 1
public class UserMapper
{
    public static My_User toEntity(UserRequest userreq)
    {
        return My_User.builder()
                .empid(userreq.getEmpid())
                .empname(userreq.getEmpname())
                .sal((userreq.getSal()))
                .build();
    }
    public  static UserResponse toUserResponseDto(My_User user)
    {
        return UserResponse.builder()
                .empid(user.getEmpid())
                .empname(user.getEmpname())
                .sal(user.getSal())
                .build();
    }
}
