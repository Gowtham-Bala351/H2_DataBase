package com.h2.H2database.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @Id
    @Min(value = 1000, message = "Employee ID must be at least 1000")
    @Max(value = 9999, message = "Employee ID must be at most 9999")
    private int empid;
    @NotBlank(message = "Employee name is required")
    private String empname;
    @Positive(message = "Salary must be a positive number")
    private double sal;
}
