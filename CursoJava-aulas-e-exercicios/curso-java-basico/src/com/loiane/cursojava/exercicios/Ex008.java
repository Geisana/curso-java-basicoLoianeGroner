package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor ganho por hora de trabalho: ");
		double valor = scan.nextDouble();
		System.out.println("Informe o n�mero de horas trabalhadas ao m�s: ");
		int hora = scan.nextInt();
		
		double salarioHora = hora * valor;
		
		System.out.println("Valor de Sal�rio Mensal "+ salarioHora);

	}

}
