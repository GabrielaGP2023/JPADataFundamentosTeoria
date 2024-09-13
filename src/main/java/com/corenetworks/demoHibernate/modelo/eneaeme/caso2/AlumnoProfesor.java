package com.corenetworks.demoHibernate.modelo.eneaeme.caso2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="alumnos_profesores")
@IdClass(AlumnoProfesorPK.class)
public class AlumnoProfesor {

    @Id
    private Alumno alumno;
    @Id
    private Profesor profesor;

    //aquí se pondrian el resto de atributos en caso de haberlos
}
