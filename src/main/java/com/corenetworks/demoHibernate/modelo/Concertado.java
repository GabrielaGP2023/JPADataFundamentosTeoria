package com.corenetworks.demoHibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "concertados")
public class Concertado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentro;
    @Column(length = 60)
    private String agrupacion;
    @Column
    private double comision;
    @OneToOne
    @JoinColumn(name="id_centro", nullable = false, foreignKey = @ForeignKey(name="FK_concertados_centros"))
    private CentrosEducativos ce;
}
