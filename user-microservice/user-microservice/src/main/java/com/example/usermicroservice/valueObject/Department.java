package com.example.usermicroservice.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

    private String departmentName;

    private String departmentAddress;

    private String departmentCode;
}
