package com.corenetworks.demoHibernate.modelo.ejercicioglobal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="clientes_abogados")
public class ClienteAbogado {
    @Id
    @Column(length = 10)
    private String dni;
    @Column(length = 60)
    private String nombre;
    @Column(length = 120)
    private String direccion;
}
