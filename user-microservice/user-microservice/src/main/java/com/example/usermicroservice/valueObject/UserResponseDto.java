package com.example.usermicroservice.valueObject;

import com.example.usermicroservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserResponseDto {

    private User user;

    private Department department;
}
