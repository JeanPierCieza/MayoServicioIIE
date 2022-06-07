package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Proveedores;

public interface ProveedorService {
	
	void guardarProveedor(Proveedores proveedor);
	void actualizarProveedor(Proveedores proveedor);
	void eliminarProveedor(Integer id);
	List<Proveedores> listarProveedores();
	Proveedores obtenerProveedorId(Integer id);

}
