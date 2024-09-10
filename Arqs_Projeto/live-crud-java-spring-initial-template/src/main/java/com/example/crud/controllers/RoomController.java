package com.example.crud.controllers;

import com.example.crud.domain.room.RequestRoom;
import com.example.crud.domain.room.RoomRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testRoom")
public class RoomController {

    @Autowired
    public RoomRepository repository;

    @GetMapping
    public ResponseEntity getAllRooms(){
        var allRooms = repository.findAll();
        return ResponseEntity.ok(allRooms);
    }

    @PostMapping
    public ResponseEntity postRoom(@RequestBody @Valid RequestRoom data){
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}
