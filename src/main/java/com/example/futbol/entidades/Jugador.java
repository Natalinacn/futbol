package com.example.futbol.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jugador_sequence")
    @SequenceGenerator(name = "jugador_sequence", sequenceName = "jugador_sequence")
    @Column(name = "id_jugador")
    private Long id;
    private String nombre;
    private String puesto;
    private Integer numero;
    @ManyToOne
    @JoinColumn(name= "equipo_id", referencedColumnName = "id_equipo")
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(Long id, String nombre, String puesto, Integer numero, Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.numero = numero;
        this.equipo = equipo;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", numero=" + numero +
                ", equipo=" + equipo +
                '}';
    }
}
