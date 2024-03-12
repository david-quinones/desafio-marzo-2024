package com.programandoenjava.desafiomarzo2024.habitacion.repository;

import com.programandoenjava.desafiomarzo2024.habitacion.model.Habitacion;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface HabitacionRepository extends JpaRepository<Habitacion, String> {
}
