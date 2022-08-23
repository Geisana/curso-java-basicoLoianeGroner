package com.loiane.cursojava.exercicios15;

import java.util.Scanner;
public class Ex011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Informe o valor do seu salário: ");
		double salario = scan.nextDouble();
		double salario1 ;
		
		System.out.println("Salário inicial: "+salario);
		if (salario <= 280) {
			salario1 = (salario + (salario * 20/100));
			System.out.println("Percentual de aumento: 20%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo salário: "+ salario1);
			
		} else if (salario > 280 && salario < 700){
			salario1 = (salario + (salario * 15/100));
			System.out.println("Percentual de aumento: 15%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo salário: "+ salario1);
			
		} else if (salario < 280 && salario >= 700){
			salario1 = (salario + (salario * 15/100));
			System.out.println("Percentual de aumento: 15%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo salário: "+ salario1);
			
		} else if (salario >= 700 && salario < 1500){
			salario1 = (salario + (salario * 10/100));
			System.out.println("Percentual de aumento: 10%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo salário: "+ salario1);
			
		} else if (salario >= 1500){
			salario1 = (salario + (salario * 5/100));
			System.out.println("Percentual de aumento: 5%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo salário: "+ salario1);
		}
		

	}

}


/*
 11.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes. 
 o Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual: 
 o salários até R$ 280,00 (incluindo) : aumento de 20% 
 o salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
 o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
 o salários de R$ 1500,00 em diante : aumento de 5% 
 Após o aumento ser realizado, informe na tela: o o salário antes do reajuste; o o percentual de aumento aplicado; o o valor do aumento; o o novo salário, após o aumento.
 
 */
