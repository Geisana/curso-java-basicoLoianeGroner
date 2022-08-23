package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex013_horas_de_trabalho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor ganho por hora de trabalho: ");
		double valor = scan.nextDouble();
		System.out.println("Informe o número de horas trabalhadas ao mês: ");
		int hora = scan.nextInt();
		
		double salario = hora * valor;
		
		System.out.println("Salario Bruto: "+ salario);

		double inss = (salario * 8)/100;
		// erro double inss2 = salario * (8/100);
		double sindicato = (salario * 5)/100;
		double impostoDeRenda = (salario * 11)/100;
		
		
		System.out.println("INSS: " +inss);
		// erro System.out.println("INSS: " +inss2);
		System.out.println(sindicato);
		System.out.println(impostoDeRenda);
		
	}

}
