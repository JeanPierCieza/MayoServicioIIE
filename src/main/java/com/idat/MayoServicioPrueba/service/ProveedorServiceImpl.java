package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.MayoServicioPrueba.model.Proveedores;
import com.idat.MayoServicioPrueba.repository.ProveedoresRepository;

public class ProveedorServiceImpl implements ProveedorService {
	
	@Autowired
	private ProveedoresRepository repository;

	@Override
	public void guardarProveedor(Proveedores proveedor) {
		// TODO Auto-generated method stub
		repository.save(proveedor);

	}

	@Override
	public void actualizarProveedor(Proveedores proveedor) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(proveedor);

	}

	@Override
	public void eliminarProveedor(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<Proveedores> listarProveedores() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Proveedores obtenerProveedorId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
