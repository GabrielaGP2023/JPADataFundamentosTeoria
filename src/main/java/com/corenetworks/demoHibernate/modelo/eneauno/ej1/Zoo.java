package com.corenetworks.demoHibernate.modelo.eneauno.ej1;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zoos")
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZoo;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 50,nullable = false)
    private String pais;
    @Column(length = 50,nullable = false)
    private String ciudad;
    private double tamano;
    private double money;
    @OneToMany(mappedBy = "z1",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    List<Animal> animales;

}
