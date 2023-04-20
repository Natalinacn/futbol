package com.example.futbol.controladores;

import com.example.futbol.entidades.Jugador;
import com.example.futbol.servicios.impl.JugadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorControlador {

    private JugadorServicio jugadorServicio;

    @Autowired
    public JugadorControlador(JugadorServicio jugadorServicio) {
        this.jugadorServicio = jugadorServicio;
    }

    @PostMapping("/guardar")
    public void crearJugador(@RequestBody Jugador jugador){

        jugadorServicio.create(jugador);

    }
    @GetMapping("/listar")
    public List<Jugador> listar(){

        return jugadorServicio.readAll();

    }


}
