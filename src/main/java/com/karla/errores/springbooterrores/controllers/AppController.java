package com.karla.errores.springbooterrores.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AppController {
    @GetMapping("/app")
    public String index(){       
        int value = 100 / 0;
        System.out.println(value);
        return "ok 200";
    }
}
