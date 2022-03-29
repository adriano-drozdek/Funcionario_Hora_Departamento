package entities;

import java.util.Date;

public class ContratoHora {

	private Date data;
	private Double ValorHora;
	private Integer hora;

	public ContratoHora(Date data, Double valorHora, Integer hora) {
		this.data = data;
		ValorHora = valorHora;
		this.hora = hora;
	}

	public ContratoHora() {

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorHora() {
		return ValorHora;
	}

	public void setValorHora(Double valorHora) {
		ValorHora = valorHora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public double valorTotal() {
		return ValorHora * hora;
	}
}
