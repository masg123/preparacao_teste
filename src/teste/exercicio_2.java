package teste;

import java.util.Scanner;

public class exercicio_2 {
	
	Scanner reader = new Scanner(System.in);
	private Scanner rand;
	int sobDesc, cont=0, aux=0;
	
	boolean acabou=false;
	char num; {	
	
	  do{
	        System.out.println("Numero "+sobDesc);
	        System.out.println("O proximo numero será:");
	        System.out.println("c-Para maior");
	        System.out.println("b-Para menor");
	        
	        num=reader.next().charAt(0);
	        aux=sobDesc;
	        
	        
		        
	        
	        System.out.println("Proximo numero é:"+sobDesc);
	        
	        if(num=='b' && sobDesc>aux){
	        	cont++;
	        	System.out.println("Voce acertou");
	        	 System.out.println("Total pontos:"+cont);
	        }
	        if(num=='b'&& sobDesc<aux){
		           System.out.println("Voce errou");
		           acabou=true;
	        }
	        if(num=='c'&& sobDesc<aux){
	            cont++;
	            System.out.println("Voce acertou");
	            System.out.println("Total pontos:"+cont);
	        }
	        if(num=='c'&& sobDesc>aux){
		           System.out.println("Voce errou");
		           acabou=true;
		        }
	        
	  }while(acabou!=true);
	    System.out.println("O jogo acabou");
	    System.out.println("Voce acertou "+cont+" vezes");
	    System.out.println("Parabens");
		           
	  }

	}

	
	