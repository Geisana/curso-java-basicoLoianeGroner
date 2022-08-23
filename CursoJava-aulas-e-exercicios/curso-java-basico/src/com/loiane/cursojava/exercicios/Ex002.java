package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		System.out.println("Digite um numero inteiro: ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		System.out.println("O número informado foi ["+ numero + "]");
	}

}
