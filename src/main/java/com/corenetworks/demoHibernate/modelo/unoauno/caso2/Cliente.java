package com.corenetworks.demoHibernate.modelo.unoauno.caso2;

import jakarta.persistence.*;
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
