package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.services.TimeFutebolService;

@RestController
@RequestMapping("/time-futebol")
public class TimeFutebolController {

@Autowired
TimeFutebolService tImeFutebolService;

    @GetMapping
    public ResponseEntity<?> getTimes(){

        var times = tImeFutebolService.getAllTimes();

        return ResponseEntity.ok(times);
    }
    
}
