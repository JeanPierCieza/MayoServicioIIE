package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Clientes;

public interface ClienteService {

	void guardarCliente(Clientes cliente);
	void actualizarCliente(Clientes cliente);
	void eliminarCliente(Integer id);
	List<Clientes> listarClientes();
	Clientes obtenerClientesId(Integer id);
	
}
