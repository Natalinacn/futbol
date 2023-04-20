package com.example.futbol.controladores;

import com.example.futbol.entidades.Equipo;
import com.example.futbol.excepciones.ArgumentosNoValidos;
import com.example.futbol.servicios.IEquipoService;
import com.example.futbol.servicios.impl.EquipoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

    private IEquipoService equipoServicio;

    public EquipoController(IEquipoService equipoServicio) {
        this.equipoServicio = equipoServicio;
    }

    @Autowired


    @PostMapping("/guardar")
    public void crearEquipo(@RequestBody Equipo equipo){

        equipoServicio.create(equipo);

    }
    @GetMapping("/listar")
    public List<Equipo> listarEquipos(){

        return equipoServicio.readAll();

    }


    @GetMapping("/{id}")
    public Equipo buscarPorId(@PathVariable Long id){

        return equipoServicio.read(id);
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Equipo equipo){

        equipoServicio.update(equipo);


    }

    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable Long id){

        equipoServicio.delete(id);
    }


    @ExceptionHandler(ArgumentosNoValidos.class)
    public ResponseEntity<String> procesarArgInv(ArgumentosNoValidos argumentosNoValidos);


}
