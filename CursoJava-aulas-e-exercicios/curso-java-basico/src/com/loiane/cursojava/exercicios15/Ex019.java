package com.loiane.cursojava.exercicios15;

import java.util.Scanner ;
public class Ex019 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int n = scan.nextInt();
		System.out.println("Informe outro número inteiro: ");
		int n1 = scan.nextInt();
		System.out.println("Informe a operação a ser realizada: \n[+] Adição \n[-] Subtração \n[*] Multiplicação \n[/]Divisão");
		double resposta = 0;
		String operador = scan.next();
		boolean valida = true ;
		
		switch (operador) {
		case "+": resposta = n + n1 ; break;
		case "-": resposta = n - n1 ; break;
		case "*": resposta = n * n1 ; break;
		case "/": resposta = n / n1 ; break;
		default: 
			System.out.println("Operação inválida"); 
            valida = false;
		} 
		if (valida == true) {
			System.out.println("Resultado: "+resposta);
			
		} if (resposta >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
			
		}
		if (resposta % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		

	}

}
