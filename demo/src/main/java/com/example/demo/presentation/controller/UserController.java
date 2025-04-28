package com.example.demo.presentation.controller;

import com.example.demo.presentation.dto.UserDTO;
import com.example.demo.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //FindALl
    @GetMapping("/find")
    public  ResponseEntity<List<UserDTO>> findALL(){
        return new ResponseEntity<>(this.userService.findAll(), HttpStatus.OK);
    }

    //FindByID
    @GetMapping("/find/{id}")
    public  ResponseEntity<UserDTO> findById(@PathVariable Long id){
        return new ResponseEntity<>(this.userService.findByid(id), HttpStatus.OK);
    }

    //create
    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(this.userService.createUser(userDTO), HttpStatus.CREATED);
    }

    //Update
    @PutMapping("/update/{id}  ")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id){
        return new ResponseEntity<>(this.userService.updateUser(userDTO, id), HttpStatus.OK);
    }

    //Delete
    @DeleteMapping("/delete/{id}  ")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        return new ResponseEntity<>(this.userService.deleteUser(id), HttpStatus.NO_CONTENT);
    }
}
