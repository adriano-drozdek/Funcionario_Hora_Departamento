package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enuns.NivelDeTrabalho;

public class Trabalho {

	private String nome;
	private NivelDeTrabalho nivel;
	private Double SalarioBase;

	private Departamento departamernto;
	private List<ContratoHora> contratos = new ArrayList<>();

	public Trabalho(String nome, NivelDeTrabalho nivel, Double salarioBase, Departamento departamernto) {
		this.nome = nome;
		this.nivel = nivel;
		SalarioBase = salarioBase;
		this.departamernto = departamernto;
	}

	public Trabalho() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDeTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelDeTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		SalarioBase = salarioBase;
	}

	public Departamento getDepartamernto() {
		return departamernto;
	}

	public void setDepartamernto(Departamento departamernto) {
		this.departamernto = departamernto;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	public void addContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
}
