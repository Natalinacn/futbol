package com.example.futbol.servicios;

import com.example.futbol.entidades.Equipo;
import com.example.futbol.excepciones.ArgumentosNoValidos;

public interface IEquipoService extends IModelServicio<Equipo>{

void validar(Equipo equipo) throws ArgumentosNoValidos;
}
