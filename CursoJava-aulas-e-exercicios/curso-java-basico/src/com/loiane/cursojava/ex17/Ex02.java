package com.loiane.cursojava.ex17;

import java.util.Scanner ;
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nomeUsuario ;
		String senha ;
		
		do {
			
			System.out.println("Cadastre seu nome de usuário:");
			nomeUsuario = scan.next();
			
			System.out.println("Cadastre sua senha");
			senha = scan.next();
			
			if (nomeUsuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha inválida.");
			} else {
				System.out.println("Senha cadastrada com sucesso!");
			}
			
		} while (nomeUsuario.equalsIgnoreCase(senha));

	}

}
