package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 

@Entity
public class TipoCambio {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  
    @Column(name = "monedaOrigen")
    private String monedaOrigen;

    @Column(name = "monedaDestino")
    private String monedaDestino;
     
    @Column(name = "tipoCambio")
    private Double tipoCambio;

	public TipoCambio(String monedaOrigen, String monedaDestino, Double tipoCambio) {
		super();
		this.tipoCambio = tipoCambio;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}
    
    

}
