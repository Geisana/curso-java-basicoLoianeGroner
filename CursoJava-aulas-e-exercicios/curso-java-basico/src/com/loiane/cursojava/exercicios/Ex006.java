package com.loiane.cursojava.exercicios;
import java.util.Scanner;

public class Ex006 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do raio do c�rculo: ");
		double raio = scan.nextDouble();
		
		double area = 3.14*(raio*raio);
		System.out.println("O valor da �rea do c�rculo � "+area);
		
		double area1 = Math.PI * Math.pow(raio, 2) ;
		System.out.println("O valor da �rea do c�rculo � "+area1);
		
			}

		}


