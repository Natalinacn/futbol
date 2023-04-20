package com.example.futbol.servicios.impl;

import com.example.futbol.entidades.Equipo;
import com.example.futbol.excepciones.ArgumentosNoValidos;
import com.example.futbol.repositorios.IEquipoRepositorio;
import com.example.futbol.servicios.IEquipoService;
import com.example.futbol.servicios.IModelServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServicio implements IEquipoService {



    private IEquipoRepositorio equipoRepositorio;
    @Autowired
    public EquipoServicio(IEquipoRepositorio equipoRepositorio) {

        this.equipoRepositorio = equipoRepositorio;
    }



    @Override
    public void create(Equipo equipo) {

        equipoRepositorio.save(equipo);

    }

    @Override
    public Equipo read(long id) {


        return equipoRepositorio.findById(id).get();

    }

    @Override
    public List<Equipo> readAll() {


        return equipoRepositorio.findAll();

    }

    @Override
    public void update(Equipo equipo) {

        equipoRepositorio.save(equipo);

    }

    @Override
    public void delete(long id) {

        equipoRepositorio.deleteById(id);
    }

    public Equipo buscarPorNombre(String nombre){
        return equipoRepositorio.findByNombre(nombre);

    }

    @Override
    public void validar(Equipo equipo) throws ArgumentosNoValidos {

        if(equipo.getNombre().length() <= 3 || equipo.getCiudad().length() >=3){

            throw new ArgumentosNoValidos("El campo debe tener más de 3 caraacteres");


        }

    }
}
