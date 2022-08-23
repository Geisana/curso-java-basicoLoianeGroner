 package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em metros (m)");
		double metro = scan.nextDouble();
		
		double centimetro = metro*100;
		
		System.out.println("O valor "+metro+"m em centímetros é "+centimetro+"cm");
		

	}

}
