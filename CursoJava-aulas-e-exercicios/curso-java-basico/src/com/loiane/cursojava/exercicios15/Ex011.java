package com.loiane.cursojava.exercicios15;

import java.util.Scanner;
public class Ex011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Informe o valor do seu sal�rio: ");
		double salario = scan.nextDouble();
		double salario1 ;
		
		System.out.println("Sal�rio inicial: "+salario);
		if (salario <= 280) {
			salario1 = (salario + (salario * 20/100));
			System.out.println("Percentual de aumento: 20%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo sal�rio: "+ salario1);
			
		} else if (salario > 280 && salario < 700){
			salario1 = (salario + (salario * 15/100));
			System.out.println("Percentual de aumento: 15%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo sal�rio: "+ salario1);
			
		} else if (salario < 280 && salario >= 700){
			salario1 = (salario + (salario * 15/100));
			System.out.println("Percentual de aumento: 15%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo sal�rio: "+ salario1);
			
		} else if (salario >= 700 && salario < 1500){
			salario1 = (salario + (salario * 10/100));
			System.out.println("Percentual de aumento: 10%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo sal�rio: "+ salario1);
			
		} else if (salario >= 1500){
			salario1 = (salario + (salario * 5/100));
			System.out.println("Percentual de aumento: 5%. ");
			System.out.println("Valor do aumento: "+ (salario1 - salario));
			System.out.println("Valor do novo sal�rio: "+ salario1);
		}
		

	}

}


/*
 11.As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contraram para desenvolver o programa que calcular� os reajustes. 
 o Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual: 
 o sal�rios at� R$ 280,00 (incluindo) : aumento de 20% 
 o sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15% 
 o sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
 o sal�rios de R$ 1500,00 em diante : aumento de 5% 
 Ap�s o aumento ser realizado, informe na tela: o o sal�rio antes do reajuste; o o percentual de aumento aplicado; o o valor do aumento; o o novo sal�rio, ap�s o aumento.
 
 */
