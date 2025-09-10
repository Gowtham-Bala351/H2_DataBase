package com.h2.H2database.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //for object creation in a clean, readable, and flexible way.
public class My_User {
    @Id
    private int empid;
    private String empname;
    private double sal;
}
