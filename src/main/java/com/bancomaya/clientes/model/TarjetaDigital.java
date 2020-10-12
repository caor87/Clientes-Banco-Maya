package com.bancomaya.clientes.model;

public class TarjetaDigital {

	private int id;
	private String banco;
	private String cliente;
	private String numero;
	private String fechaVencimineto;
	private String numeroSeguridad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getFechaVencimineto() {
		return fechaVencimineto;
	}
	public void setFechaVencimineto(String fechaVencimineto) {
		this.fechaVencimineto = fechaVencimineto;
	}
	public String getNumeroSeguridad() {
		return numeroSeguridad;
	}
	public void setNumeroSeguridad(String numeroSeguridad) {
		this.numeroSeguridad = numeroSeguridad;
	}
}
