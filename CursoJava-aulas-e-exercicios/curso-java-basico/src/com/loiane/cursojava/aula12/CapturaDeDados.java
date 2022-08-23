package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class CapturaDeDados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo � "+nomeCompleto);
		
		 //Ler dado especifico
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome: "+primeiroNome);
		
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade � "+idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura � "+altura);
		
		*/
		
		System.out.println("Seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estimação ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		
		System.out.println("Voce digitu os seguintes valores: ");
		System.out.println("Nome: "+primeiroNome);
		System.out.println("Idade: "+idade);
		System.out.println("Quantidade de filhos "+qFilhos);
		System.out.println("Altura "+altura);
		System.out.println("Tem bichinho de estimação  "+temPet);

	}  

}
