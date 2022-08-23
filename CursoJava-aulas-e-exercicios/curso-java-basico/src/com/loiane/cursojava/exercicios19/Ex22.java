package com.loiane.cursojava.exercicios19;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetorA = new int[10];
		int percentualOff = 0;
		int percentualOn = 0;
		
		
		for (int i = 0;i < 10; i++) {			
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
			if(vetorA[i] == 0 ) {
				percentualOff ++;
				
			} else {
				percentualOn ++;
			}
		}
		
		double porc0 = (percentualOff*100)/ vetorA.length;
		double porc1 = (percentualOn*100)/ vetorA.length;
		
				
			
		System.out.println("Porcentagem 0: "+porc0);
		System.out.println("Porcentagem 1: "+porc1);
			
			
		

	}

}
