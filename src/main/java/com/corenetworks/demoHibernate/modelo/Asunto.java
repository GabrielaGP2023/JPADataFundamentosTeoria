package com.corenetworks.demoHibernate.modelo.ejercicioglobal;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="asuntos")
public class Asunto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numExpediente;
    private LocalTime finicio;
    private LocalTime fFin;
    @Column(length = 1)
    private String estado;

    @ManyToOne
    @JoinColumn(name="dni", foreignKey = @ForeignKey(name = "FK_ASUNTOS_CLIENTES"))
    private ClienteAbogado cliente;

}
