package progarma;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalho;
import entities.enuns.NivelDeTrabalho;

public class ProjetoFuncionario {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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

		System.out.println("Quantos contratos para esse trabalho: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Contrato #" + i);
			System.out.print("Data do contrato (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Quantidade de horas: ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
			trabalho.addContrato(contrato);
		}

		System.out.println();
		System.out.print("Entre com o mês e ano para calcular salário. ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: " + trabalho.getNome());
		System.out.println("Departamento: " + trabalho.getDepartamernto().getNome());
		System.out.println("Renda: " + monthAndYear + ": " + String.format("%.2f", trabalho.renda(year, month)));
		sc.close();
	}

}
