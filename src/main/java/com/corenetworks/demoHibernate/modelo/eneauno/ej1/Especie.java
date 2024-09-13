package com.corenetworks.demoHibernate.modelo.eneauno.ej1;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 50,nullable = false)
    private String nombreCientifico;
    @Column(length = 50,nullable = false)
    private String nombreVulgar;
    @Column(length = 50,nullable = false)
    private String familia;
    private boolean peligroExtinsion;
    //Opcional
    //Unicamente si el Front lo necesita
    @OneToMany(mappedBy = "e1",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    List<Animal> Animales;

}
