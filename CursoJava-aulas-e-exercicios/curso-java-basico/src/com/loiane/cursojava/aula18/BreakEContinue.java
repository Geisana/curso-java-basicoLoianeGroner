package com.loiane.cursojava.aula18;

import java.util.Scanner;
public class BreakEContinue {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for (int i = num; i <= max; i++) {
			
			if( i%7 == 0) {
				System.out.println("O valor de i é "+ i);
				
				break; // primeiro numero divisivel por 7
			}
		}
		*/
		
		//Goto não é usual na vida do desenvolvedor
		
		for (int i = 0; i <=4; i++) {
			rotulo1:{
				rotulo2:{
					rotulo3:{
						if (i==1) {
							break rotulo1;
						}
						if (i==2) {
							break rotulo2;
						}
						if (i==3) {
							break rotulo3;
						}
						System.out.println("Rotulo3");	
					}
					System.out.println("Rotulo2");
				}
				System.out.println("Rotulo1");
			}
			System.out.println(i);
		}

	}

}
