package com.karla.errores.springbooterrores.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.karla.errores.springbooterrores.exceptions.UserNotFoundException;
import com.karla.errores.springbooterrores.models.domain.User;
import com.karla.errores.springbooterrores.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private UserService service;
    @GetMapping("/app")
    public String index(){       
        //int value = 100 / 0;
        int value =  Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id){       
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe") );
      /*  if(user == null){
            throw new UserNotFoundException("Error el usuario no existe");
        } */
        System.out.println(user.getLastName());
        return user;
    }

}
