package com.example.demo.presentation.dto;


import lombok.Data;

@Data
public class UserDTO {
    private Long id;

    private String name;

    private String lastName;

    private String Email;
    private byte age;
}
