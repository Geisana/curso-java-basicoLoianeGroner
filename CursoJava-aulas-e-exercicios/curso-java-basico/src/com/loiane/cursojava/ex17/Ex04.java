package com.loiane.cursojava.ex17;

import java.util.Scanner ;
public class Ex04 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		int popA = 80000;
		int popB = 200000;
		int ano = 0;
		
		while (popA < popB)
		{
			
			//System.out.println("Popula��o A: "+ popA  + " Popula��o B: " +popB);
			
			popA += (popA/100) * 3 ;
			popB += (popB/100) * 1.5 ;
			ano ++ ; 
			 
		} 
		System.out.println("Popula��o A: "+ popA);
		System.out.println("Popula��o B: "+ popB);
		System.out.println("Popula��o A ser� maior que popula��o B em "+ ano +" Anos");
		
	}

}
