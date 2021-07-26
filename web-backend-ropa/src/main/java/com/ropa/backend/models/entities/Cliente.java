package com.ropa.backend.models.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente extends Persona implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_cliente")
	private Integer idCliente;
	
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	
	@OneToOne(mappedBy = "cliente")
	private Factura factura;
	
	@JoinColumn(name = "id_direccion_envio", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private DireccionEnvio direccionEnvio;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id) {
		super();
		this.idCliente = id;
	}

	public Integer getIdPersona() {
		return idCliente;
	}

	public void setIdPersona(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
