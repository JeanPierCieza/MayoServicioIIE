package com.idat.MayoServicioPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Clientes;

@Repository
public interface ClientesRepository  extends JpaRepository<Clientes, Integer>{

}
