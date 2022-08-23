package com.loiane.cursojava.exercicios15;
import java.util.Scanner ; 
public class Ex005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a primeira nota ");
		double nota1 = scan.nextDouble();
		System.out.println("Informe a primeira nota ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media == 10){
			System.out.println("Aluno(a) aprovado com distinção. ");
		} else if (media >= 7) {
			System.out.println("Aluno(a) aprovado. ");
		} else if (media < 7) {
			System.out.println("Aluno(a) reprovado. ");
		}
		
		

	}

}
