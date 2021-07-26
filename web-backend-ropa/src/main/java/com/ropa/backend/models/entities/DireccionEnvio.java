package com.ropa.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="direccionesEnvio")
public class DireccionEnvio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_direccion_envio")
	private Integer idDireccionEnvio;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="codigo_postal")
	private String codigoPostal;
	
	@OneToOne(mappedBy = "direccionEnvio")
	private Cliente cliente;
	
	public DireccionEnvio() {
		super();
	}
	
	public DireccionEnvio(int id) {
		super();
		this.idDireccionEnvio = id;
	}

	public Integer getIdDireccionEnvio() {
		return idDireccionEnvio;
	}

	public void setIdDireccionEnvio(Integer idDireccionEnvio) {
		this.idDireccionEnvio = idDireccionEnvio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
}
