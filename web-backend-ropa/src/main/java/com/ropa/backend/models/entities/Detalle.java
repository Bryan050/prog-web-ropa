package com.ropa.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalles")
public class Detalle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_detalle")
	private Integer idDetalle;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@JoinColumn(name="id_factura", referencedColumnName= "id_factura")
	@ManyToOne
	private Factura factura;
	
	@JoinColumn(name = "id_producto", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private Producto producto;
	
	public Detalle(){
		super();
	}
	
	public Detalle(int id){
		super();
		this.idDetalle = id;
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
