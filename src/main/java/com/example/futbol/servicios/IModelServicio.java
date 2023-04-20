package com.example.futbol.servicios;

import java.util.List;

public interface IModelServicio <T>{

    void create(T t);

    T read(long id);

    List<T> readAll();

    void update(T t);

    void delete(long id);
}
