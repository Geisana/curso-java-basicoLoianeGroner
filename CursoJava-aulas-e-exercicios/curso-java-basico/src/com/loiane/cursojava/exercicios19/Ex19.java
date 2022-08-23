package com.loiane.cursojava.exercicios19;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] nomeAluno = new String[10];
		double[] nota1 = new double[10] ;
		double[] nota2 = new double[10] ;
		double[] media = new double[10] ;
		String[] resultado = new String[10];
		
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print("Aluno:  ");
			nomeAluno[i] = scan.next();
			System.out.print("Informe a primeira nota: ");
			nota1[i] = scan.nextDouble();
			System.out.print("Informe a segunda nota: ");
			nota2[i] = scan.nextDouble();
			
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			media [i] = (nota1[i] + nota2[2]) / 2 ;
			if (media[i] >= 7) {
				resultado[i] = "Aprovado";
			} else {
				resultado[i] = "Reprovado";
			}
		}
		
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("Nome: "+ nomeAluno[i] + " |01-Nota: " + nota1[i] + " |02-Nota: "+ nota2[i]);
			System.out.println("Resultado: " + resultado[i]);
		}

	}

}
