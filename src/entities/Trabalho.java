package entities;

import java.util.List;

import entities.enuns.NivelDeTrabalho;

public class Trabalho {

	private String nome;
	private NivelDeTrabalho nivel;
	private Double SalarioBase;

	private Departamento departamernto;
	private List<ContratoHora> contratos;

}
