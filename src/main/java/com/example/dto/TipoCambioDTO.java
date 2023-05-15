package com.example.dto;
 

public class TipoCambioDTO {
     
    private Double monto;
    private String monedaOrigen;
    private String monedaDestino;
    private Double montoTipoCambio;
    private Double tipoCambio;
    
	public TipoCambioDTO(String monedaOrigen, String monedaDestino, Double monto) {
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.monto = monto; 
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public Double getMontoTipoCambio() {
		return montoTipoCambio;
	}
	public void setMontoTipoCambio(Double montoTipoCambio) {
		this.montoTipoCambio = montoTipoCambio;
	}
	public Double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
    
}
