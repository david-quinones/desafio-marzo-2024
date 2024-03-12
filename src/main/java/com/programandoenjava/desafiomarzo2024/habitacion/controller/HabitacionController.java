package com.programandoenjava.desafiomarzo2024.habitacion.controller;

import com.programandoenjava.desafiomarzo2024.habitacion.service.HabitacionService;
import com.programandoenjava.desafiomarzo2024.habitacion.model.Habitacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/habitacion")
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService;

    // Create
    @PostMapping
    public ResponseEntity<Habitacion> crear(@RequestBody Habitacion habitacion){
        Habitacion bdHabitacion = habitacionService.save(habitacion);
        return new ResponseEntity<>(bdHabitacion, HttpStatus.CREATED);
    }

    // Read All
    @GetMapping
    public ResponseEntity<List<Habitacion>> listarTodo(){
        List<Habitacion> habitaciones = habitacionService.listAll();
        if(habitaciones.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return new ResponseEntity<>(habitaciones, HttpStatus.OK);
    }

    // Edit
    @PutMapping
    public ResponseEntity<Habitacion> editar(@RequestBody Habitacion habitacion){
        return new ResponseEntity<>(habitacionService.save(habitacion), HttpStatus.OK);
    }

}
