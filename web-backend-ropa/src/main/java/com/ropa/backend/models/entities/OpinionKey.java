package com.ropa.backend.models.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OpinionKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_cliente")
	private Integer idCliente;
	
	@Column(name = "id_producto")
	private Integer idProducto;
	
	public OpinionKey() {
		super();
	}
	
	public OpinionKey(Integer idCliente, Integer idProducto) {
		super();
		this.idCliente = idCliente;
		this.idProducto = idProducto;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idCliente, idProducto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OpinionKey other = (OpinionKey) obj;
		return Objects.equals(idCliente, other.idCliente) && Objects.equals(idProducto, other.idProducto);
	}
}
