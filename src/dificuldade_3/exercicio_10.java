package dificuldade_3;

import java.util.Scanner;

public class exercicio_10 {

	public exercicio_10() {
		
		 Scanner reader = new Scanner(System.in);
		    int num1,num2;
		    char op;
		    System.out.println("----Exercicio Calculadora Infinita----");
		    System.out.print("Introduza um numero:");
		    num1=reader.nextInt();
		    
		    do{
		    System.out.println("Escolha uma operação: ");
		    System.out.println("+ Soma");
		    System.out.println("- Subtrair");
		    System.out.println("* Multiplicar");
		    System.out.println("/ Dividir");
		    System.out.println("0 Sair do Programa");
		    op=reader.next().charAt(0);
		     
		    if(op!='0'){
		    
		        System.out.print("Introduza um numero:");
		        num2=reader.nextInt();
		    
		            switch(op){

		                case '+':
		                num1=num1+num2;
		                System.out.println(num1);
		                break;
		                case '-':
		                num1=num1-num2;
		                System.out.println(num1);
		                break;
		                case '*':
		                num1=num1*num2;
		                System.out.println(num1);
		                break;
		                case '/':
		                num1=num1/num2;
		                System.out.println(num1);
		                break;
		                default:
		                System.out.println("Operação invalida");


		            }//Fim do switch
		            
		            
		    }else if(op=='0')
		        System.out.println("Fim do Programa Calculadora Infinita");
		        
		    }while(op!='0');
		    
		    }
		
	}


