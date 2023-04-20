package com.example.futbol.servicios.impl;

import com.example.futbol.entidades.Equipo;
import com.example.futbol.entidades.Jugador;
import com.example.futbol.repositorios.IJugadorRepositorio;
import com.example.futbol.servicios.IJugadorService;
import com.example.futbol.servicios.IModelServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServicio implements IJugadorService {


    private IJugadorRepositorio jugadorRepositorio;
    private EquipoServicio equipoServicio;

    @Autowired
    public JugadorServicio(IJugadorRepositorio jugadorRepositorio, EquipoServicio equipoServicio) {
        this.jugadorRepositorio = jugadorRepositorio;
        this.equipoServicio = equipoServicio;
    }


    @Override
    public void create(Jugador jugador) {

        Equipo equipo = equipoServicio.read(jugador.getEquipo().getId());
        jugador.setEquipo(equipo);
        jugadorRepositorio.save(jugador);


    }

    @Override
    public Jugador read(long id) {


        return jugadorRepositorio.findById(id).get();

    }

    @Override
    public List<Jugador> readAll() {


        return jugadorRepositorio.findAll();
    }

    @Override
    public void update(Jugador jugador) {

        equipoServicio.update(jugador.getEquipo());
        jugadorRepositorio.save(jugador);
    }

    @Override
    public void delete(long id) {

        jugadorRepositorio.deleteById(id);

    }

    public Jugador buscarPorNombre(String nombre){
        return jugadorRepositorio.findByNombre(nombre);

    }

    @Override
    public List<Jugador> buscarPorClubes(Long id) {
        return null;
    }
}
