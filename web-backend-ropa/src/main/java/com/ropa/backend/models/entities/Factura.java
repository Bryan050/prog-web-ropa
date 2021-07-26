package com.ropa.backend.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="facturas")
public class Factura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="id_factura")
	private Integer idFactura;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="fecha")
	private Calendar fecha;
	
	@Column(name="subtotal")
	private float subtotal;
	
	@Column(name="iva")
	private float iva;
	
	@Column(name="total")
	private float total;
	
	//mappedBy va el nombre del atributo de esta clase [Invernadero] en la clase asociada [Bloque]
	@OneToMany(mappedBy="factura", fetch = FetchType.LAZY)	
	private List<Detalle> detalles;
	
	@JoinColumn(name = "id_cliente", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private Cliente cliente;	
	
	@JoinColumn(name = "id_metodo_pago", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private MetodoPago metodoPago;
	
	public Factura(){
		super();
	}
	
	public Factura(int id){
		super();
		this.idFactura = id;
	}

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
}
