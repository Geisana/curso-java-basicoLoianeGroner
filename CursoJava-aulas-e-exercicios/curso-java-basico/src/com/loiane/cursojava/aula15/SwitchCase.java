package com.loiane.cursojava.aula15;
import java. util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um dia da semana: ");
		int diaDaSemana = scan.nextInt();
		
		/*
		if (diaDaSemana == 1) {
			System.out.println("DOMINGO");
		}
		else if (diaDaSemana == 2) {
			System.out.println("SEGUNDA");
		}
		else if (diaDaSemana == 3) {
			System.out.println("TERÇA - FEIRA ");
		}
		else if (diaDaSemana == 4) {
			System.out.println("QUARTA - FEIRA");
		}
		else if (diaDaSemana == 5) {
			System.out.println("QUINTA - FEIRA ");
		}
		else if (diaDaSemana == 6) {
			System.out.println("SEXTA - FEIRA ");
		}
		else if (diaDaSemana == 7) {
			System.out.println("SABADO ");
		}
		else {
			System.out.println("dia da semana inválido ");
		}
		
		switch (diaDaSemana) {
		case 1: System.out.println("DOMINGO"); break;
		case 2: System.out.println("SEGUNDA");break;
		case 3: System.out.println("TERÇA-FEIRA"); break;
		case 4: System.out.println("QUARTA-FEIRA"); break;
		case 5: System.out.println("QUINTA-FEIRA"); break;
		case 6: System.out.println("SEXTA-FEIRA"); break;
		case 7: System.out.println("SABADO"); break;
		default : System.out.println("dia da semana inválido ");
		}
		
		*/
		switch (diaDaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("DIA UTIL"); break;
		case 7: System.out.println("Fim de semana"); break;
		default : System.out.println("dia da semana inválido ");
		}
	} 	

}
