package com.idat.MayoServicioPrueba.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.idat.MayoServicioPrueba.model.Clientes;
import com.idat.MayoServicioPrueba.repository.ClientesRepository;

public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClientesRepository repository;

	@Override
	public void guardarCliente(Clientes cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);

	}

	@Override
	public void actualizarCliente(Clientes cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);

	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<Clientes> listarClientes() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Clientes obtenerClientesId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
