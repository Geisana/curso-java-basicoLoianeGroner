package com.loiane.cursojava.ex17;

import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro número: ");
		int n1 = scan.nextInt();
		System.out.println("Informe o ultimo número: ");
		int n2 = scan.nextInt();
		
		if (n2 > n1) {
			for (int i = n1 ; i < n2 ; i++) {
				System.out.print(i + " ");
				} } else if (n1 > n2){
						for (int i = n1 ; i > n2 ; i--) {
							System.out.print(i +" ");
							}
					}
	
	
	
	}}

