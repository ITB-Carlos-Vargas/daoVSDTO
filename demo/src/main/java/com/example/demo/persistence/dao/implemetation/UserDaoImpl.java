package com.example.demo.persistence.dao.implemetation;

import com.example.demo.persistence.dao.interfaces.IUserDAO;
import com.example.demo.persistence.entity.UserEntity;
import com.example.demo.presentation.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements IUserDAO {
    @Override
    public List<UserEntity> findAll() {
        return List.of();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public UserEntity saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserEntity deleteUser(Long id) {
        return null;
    }
}
