package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.TImeFutebolEntity;
import com.example.demo.repository.TImeFutebolRepository;

@Service
public class TimeFutebolService {

    @Autowired
    TImeFutebolRepository tImeFutebolRepository;

    public List<TImeFutebolEntity> getAllTimes() {

        return tImeFutebolRepository.findAll();

    }

}
