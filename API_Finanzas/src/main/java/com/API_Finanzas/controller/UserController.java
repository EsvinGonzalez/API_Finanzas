package com.API_Finanzas.controller;

import com.API_Finanzas.dao.UserDAO;
import com.API_Finanzas.entities.User;
import com.API_Finanzas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    private UserDAO userDAO;

    @GetMapping
    public List<User> listarUser(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User obtenerUsers(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping
    public void guardarUsers(@RequestBody User estudiante){
        userService.createUser(estudiante);
    }

    @PutMapping("/{id}")
    public void actualizarUsers(@PathVariable Long id, @RequestBody User user){
        userService.modifyUser(id,user);
    }

    @DeleteMapping("/{id}")
    public void eliminarUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}

