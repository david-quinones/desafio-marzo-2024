package com.programandoenjava.desafiomarzo2024.habitacion.model;

import com.programandoenjava.desafiomarzo2024.habitacion.enums.HabitacionTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "habitaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20, nullable = false, unique = true)
    private String numeroHabitacion;

    @Column(length = 20, nullable = false)
    private HabitacionTypes type;

    @Column(nullable = false)
    private float price;

    public Habitacion(HabitacionTypes type, float price) {
        this.type = type;
        this.price = price;
    }


}
