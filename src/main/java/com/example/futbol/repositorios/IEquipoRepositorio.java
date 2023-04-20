package com.example.futbol.repositorios;

import com.example.futbol.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipoRepositorio extends JpaRepository<Equipo,Long> {
    @Query("Select e from Equipo e where e.nombre=?1")

    Equipo findByNombre(String nombre);



}
