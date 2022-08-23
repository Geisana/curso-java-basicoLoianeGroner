package com.loiane.cursojava.exercicios;
import java.util.Scanner;
public class Ex007 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2) ;
		
		//double area = lado*lado ;
		System.out.println("O valor da área do quadrado é "+ area+ " u.m" );
		System.out.println("O dobro da area do quadrado é "+ (area*2)+ " u.m" );
		
		

	}

}
