package teste;

import java.util.Scanner;

public class exercicio_1 {
	Scanner scan = new Scanner(System.in);
	char[] numeros = new char[5];
	int[] contador = new int[10];
	
	System.out.println("Insira 5 numeros: ");
	
	for(int i=0; i<5; i++){
		do{
			System.out.print("\nNumero "+(i+1)+": ");
			numeros[i] = scan.next().charAt(0);
		}while(numeros[i]<48||numeros[i]>57);
		
		contador[(numeros[i]-48)]+=1;
	
	
	for(int i=0; i<10;i++){
		System.out.print("Quantidade de "+i+"s: ");
		System.out.println(contador[i]);
	}
}
}