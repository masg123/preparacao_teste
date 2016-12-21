package teste;

import java.util.Scanner;

public class exercicio_6 {

	public exercicio_6() {
		Scanner scan = new Scanner(System.in);
		int num=0,verifica=0,i=0,j=0;
		
		do{
			System.out.print("Introduza um numero: ");
			num = scan.nextInt();
		}while(num<0);
		
		System.out.print("2\n");
		for(i=3; i<=num; i+=2){
			for(j=3; j<(i/2); j+=2){
				if(i%j==0)
					verifica++;
			}
			
			if(verifica==0)
				System.out.println(i);
			
			verifica=0;
		}
	}
	}


