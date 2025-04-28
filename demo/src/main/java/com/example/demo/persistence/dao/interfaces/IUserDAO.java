package com.example.demo.persistence.dao.interfaces;

import com.example.demo.persistence.entity.UserEntity;
import com.example.demo.presentation.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {
    List<UserEntity>  findAll();

    Optional<UserEntity> findById(Long id);

    UserEntity saveUser(UserDTO userDTO);

    UserEntity updateUser(UserDTO userDTO);

    UserEntity deleteUser(Long id);
}
