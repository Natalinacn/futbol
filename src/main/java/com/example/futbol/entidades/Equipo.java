package com.example.futbol.entidades;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
@Table(name ="equipos")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipo_sequence")
    @SequenceGenerator(name = "equipo_sequence", sequenceName = "equipo_sequence")
    @Column(name = "id_equipo")
    private Long id;
    private String nombre;
    private String ciudad;

    public Equipo() {
    }

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
