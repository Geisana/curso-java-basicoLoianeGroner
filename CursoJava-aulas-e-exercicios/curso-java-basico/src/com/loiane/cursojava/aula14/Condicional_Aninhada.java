package com.loiane.cursojava.aula14;
import java.util.Scanner;
public class Condicional_Aninhada {

	public static void main(String[] args) {
		// barata <= 10
		// 15 <= valor 17 - pesquisar mais
		// >= 17 - muito caro
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do produto: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar. ");
			} 
		
		else if (valor > 10 && valor < 15) {
			System.out.println("Voce pode pedir um desconto ");
			}
		
		else if (valor >= 15 && valor < 17 ) {
				System.out.println("Pode pesquisar mais. ");
			}
		else {
			System.out.println("Muito caro ");
		}
			}
		
	}

