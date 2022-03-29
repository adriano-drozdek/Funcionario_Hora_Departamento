package progarma;

import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.Trabalho;
import entities.enuns.NivelDeTrabalho;

public class ProjetoFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = sc.nextDouble();
		Trabalho trabalho = new Trabalho(nomeTrabalhador, NivelDeTrabalho.valueOf(nivelTrabalhador), salarioBase,
				new Departamento(nomeDepartamento));
		sc.close();
	}

}
