package com.example.crud.controllers;

import com.example.crud.domain.tile.RequestTile;
import com.example.crud.domain.tile.TileRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testTile")
public class TileController {

    @Autowired
    private TileRepository repository;

    @GetMapping
    public ResponseEntity getAllTiles(){
        var allTiles = repository.findAll();
        return ResponseEntity.ok(allTiles);
    }

    @PostMapping
    public ResponseEntity postTile(@RequestBody @Valid RequestTile data){
        System.out.println(data);
        return ResponseEntity.ok().build();
    }
}
