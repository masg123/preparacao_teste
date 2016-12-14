package dificuldade_3;

import java.util.Scanner;

public class exercicio_10 {

	public exercicio_10() {
		
		
		int num1;
		int num2;
		int escolha = 0; 
		
		
		
		System.out.println(" Introduza o primeiro numero");
		num1 =(new Scanner(System.in)).nextInt();
		
		
		
		
		System.out.println(" -Qual a operação que deseja?");
		System.out.println(" -Soma ");
		System.out.println(" -Subtração ");
		System.out.println(" -Dividir ");
		System.out.println(" -Multiplicar ");
		System.out.println(" -Sair ");
		
		System.out.println(" -escolha ");
		
		System.out.println(" Introduza o segundo numero");
		num2 =(new Scanner(System.in)).nextInt();
		
		escolha = (new Scanner(System.in)).nextInt();
		
		
			
			if (escolha == 1){
				
				int soma = num1 + num2;
				
			}if( escolha == 2){
				
				int subtrair = num1 - num2;
					
			}if ( escolha == 3){
				
				int Divisao = num1 / num2;
				
			}if (escolha == 4){
				
				int multiplicação = num1*num2;
				
				
			}else
				System.out.println(" End ");
			
			
		
	
	}
		
	}


