package com.example.futbol.repositorios;

import com.example.futbol.entidades.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IJugadorRepositorio extends JpaRepository<Jugador,Long> {

    @Query("Select j from Jugador j where j.nombre=?1")
    Jugador findByNombre(String nombre);

}
