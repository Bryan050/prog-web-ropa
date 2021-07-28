package com.ropa.backend.models.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="opiniones")
public class Opinion implements Serializable {
	
	@EmbeddedId
    private OpinionKey id;
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
    @MapsId("idCliente")
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @MapsId("idProducto")
    @JoinColumn(name = "id_producto")
    private Producto producto;
	
	@Column(name="puntuacion")
	private int puntuacion;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="descripcion")
	private String descripcion;
	
	public Opinion() {
		super();
	}
	
	public Opinion(OpinionKey id) {
		super();
		this.id = id;
	}
}
