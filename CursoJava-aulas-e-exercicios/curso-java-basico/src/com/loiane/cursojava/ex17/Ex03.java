package com.loiane.cursojava.ex17;
import java.util.Scanner ; 

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome ;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		boolean infoValida = false;
		do {
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			if (nome.length()>= 3) {
				infoValida = true;
				
				
			}else {
				System.out.println("Nome precisa de no mínimo 3 caracteres.");
			}

		} while (!infoValida);
		
		
		
		infoValida = false;
		
		do {
			System.out.println("Entre com a sua idade");
			idade = scan.nextInt();
			if (idade>= 0 && idade <= 150) {
				infoValida = true;				
				
			}else {
				System.out.println("Idade não corresponde aos parâmetros aplicado");
			}

		} while (!infoValida);
		
		
		
		
		infoValida = false;
		
		do {
			System.out.println("Entre como seu salario");
			salario = scan.nextDouble();
			if (salario >= 0) {
				infoValida = true;				
				
			}else {
				System.out.println("Salário não corresponde aos parâmetros aplicado");
			}

		} while (!infoValida);
		
		
		infoValida = false;
		
		do {
			System.out.println("Entre com o Sexo");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase ("f") || sexo.equalsIgnoreCase ("m") ) {
				infoValida = true;				
				
			}else {
				System.out.println("Sexo não corresponde aos parâmetros aplicado");
			}

		} while (!infoValida);
		
		
		infoValida = false;
		
		do {
			System.out.println("Qual o seu estado civil [S]SOLTEIRO [C] CASADO [V] VIUVO [D] DIVOCIADO ");
			estadoCivil = scan.next();
			if (estadoCivil.equalsIgnoreCase ("s") || 
					estadoCivil.equalsIgnoreCase ("c") ||
					estadoCivil.equalsIgnoreCase ("v") ||
					estadoCivil.equalsIgnoreCase ("d") ) {
				
				infoValida = true;				
				
			}else {
				System.out.println("Estado civil não corresponde aos parâmetros aplicado");
			}

		} while (!infoValida);
		
		
		System.out.println("As seguintes informações foram coletas! Obrigada pela participação ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salario: " + salario);
		System.out.println("Estado Civil: " + estadoCivil);
		
	}
}
