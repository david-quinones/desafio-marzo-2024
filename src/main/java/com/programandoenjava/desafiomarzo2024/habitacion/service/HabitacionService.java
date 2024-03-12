package com.programandoenjava.desafiomarzo2024.habitacion.service;

import com.programandoenjava.desafiomarzo2024.habitacion.model.Habitacion;
import com.programandoenjava.desafiomarzo2024.habitacion.repository.HabitacionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class HabitacionService {

    @Autowired
    private HabitacionRepository habitacionRespository;


    public List<Habitacion> listAll() {
        return habitacionRespository.findAll();
    }

    public Habitacion get(String id){
        return habitacionRespository.findById(id).get();
    }

    public Habitacion save(Habitacion habitacion){
        return habitacionRespository.save(habitacion);
    }

    public void delete(String id){
        habitacionRespository.deleteById(id);
    }


}
