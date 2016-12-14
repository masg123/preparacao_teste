package dificuldade_2;

import java.util.Scanner;

public class exercicio_7 {

	public exercicio_7() {
		
		int piloto1; 
		int piloto2;
		int piloto3;
		
		double pSoma=0;
			   
			  
			   
		       
		
		String nomes [] ={"piloto1", "piloto2", "piloto3"};
		
		System.out.println("Insira o tempo " + nomes[0]);
		piloto1 =new Scanner(System.in).nextInt();
		
		System.out.println("Insira o tempo " + nomes[1]);
		piloto2=new Scanner(System.in).nextInt();
		
		System.out.println("Insira o tempo " + nomes[2]);
		piloto3=new Scanner(System.in).nextInt();
	
		
		
		
			
		pSoma = (piloto1 + piloto2 + piloto3 );
		
		
		
		
		System.out.println(" A soma do tempo dos 3 piloto: \n " + pSoma);
		
		
	}

}
