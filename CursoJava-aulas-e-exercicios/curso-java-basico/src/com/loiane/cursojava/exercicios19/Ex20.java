package com.loiane.cursojava.exercicios19;
import java.util.Scanner ;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		double[] dolar = new double[20];
		double[] real = new double[20];
		
		
		for (int i = 0;i < 20; i++) {
			System.out.println("Valor em real: ");
			real[i] = scan.nextDouble() ; 
			
			dolar[i] = real[i] * 5.17;
			
			System.out.println("Valor convertido "+ dolar[i]);
			
			
		}
		

	}

}
