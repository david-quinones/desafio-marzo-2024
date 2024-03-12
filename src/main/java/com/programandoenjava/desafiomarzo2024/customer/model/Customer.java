package com.programandoenjava.desafiomarzo2024.customer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // AUTO: permite que la estrategia de generación de claves primarias sea determinada por la base de datos subyacente.
    // IDENTITY: permite que la base de datos genere claves primarias.
    // SEQUENCE: permite que la base de datos genere claves primarias utilizando una secuencia.
    // TABLE: permite que la base de datos genere claves primarias utilizando una tabla.
    // AUTO: permite que la base de datos genere claves primarias utilizando una de las estrategias anteriores.
    // NONE: no se generará ninguna clave primaria.
    private Integer id;

    @Column(length = 50, nullable = false)
    private String name;

}
