package com.h2.H2database.repository;

import com.h2.H2database.Entity.My_User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userreposit extends JpaRepository<My_User,Integer> {
}
