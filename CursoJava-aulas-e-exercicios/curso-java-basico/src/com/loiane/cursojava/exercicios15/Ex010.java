package com.loiane.cursojava.exercicios15;

import java.util.Scanner; ;
public class Ex010 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe em que turno voc� estuda: \n[M] Matutino \n[V] Vespertino \n[N] Noturno");
	 String resposta = scan.next();
	 switch (resposta) {
	 case "M" : System.out.println("Turno: Matutino"); 
	 case "m" : System.out.println("Turno: Matutino"); break;
	 case "v" : System.out.println("Turno: Vespertino");
	 case "V" : System.out.println("Turno: Vespertino"); break;
	 case "n" : System.out.println("Turno: Noturno"); 
	 case "N" : System.out.println("Turno: Noturno"); break;
	 
	 default: System.out.println("Valor inv�lido"); break;
	 }

	}

}







/*
 10.Fa�a um Programa que pergunte em que turno voc� estuda.
  Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. 
  Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
  ou "Valor Inv�lido!", conforme o caso.
 */