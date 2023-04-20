package com.example.futbol.servicios;

import com.example.futbol.entidades.Jugador;

import java.util.List;

public interface IJugadorService extends IModelServicio<Jugador>{

List<Jugador> buscarPorClubes(Long id);

}
