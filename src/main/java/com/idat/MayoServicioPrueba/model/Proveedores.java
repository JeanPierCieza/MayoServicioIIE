package com.idat.MayoServicioPrueba.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedores")
public class Proveedores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdProveedor;
	private String proveedor;
	private String direccion;
	
	@OneToOne
	@JoinColumn(name = "id_producto", 
	nullable = false,
	unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_producto) references Productos(id_producto)"))
	
	private Productos producto;
	
	
	public Integer getIdProveedor() {
		return IdProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		IdProveedor = idProveedor;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
