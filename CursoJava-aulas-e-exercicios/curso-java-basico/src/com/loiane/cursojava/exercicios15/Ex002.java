package com.loiane.cursojava.exercicios15;
import java.util.Scanner ;
public class Ex002 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro: ");
		int n = leitor.nextInt();
		
		if (n%2 == 0) {
			System.out.println("Numero informado � par. ");
		} else {
			System.out.println("N�mero informado � �mpar. ");
		}
		
		}

	}


