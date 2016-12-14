
package dificuldade_1;

import java.util.Scanner;

public class exercicio_1 {
	int valor[] = new int[5];
	int maior = 0, menor = 0; 
	
	for(int i = 0; i < valor.length; i++){
		
		System.out.print("Digite o " +(i+1)+"º valor: ");
		Scanner sc;
		valor[i] = sc.nextInt();
		if(valor[i] > maior){ 
			maior = valor[i];
	
		}
	}
	for (int j = 0; j < valor.length; j++) {
		if(valor[j] < menor){
			menor = valor[j];
		}
	}
		
	}
	System.out.println("Maior valor = "+ maior);
	System.out.println("Menor valor = "+ menor);
}
	
	

