package teste;

import java.util.Scanner;

public class exercicio_4 {

	public exercicio_4() {
		Scanner scan = new Scanner(System.in);
		int pessoas=0,dinheiroCamisolas=0;
		float dinheiroBilhetes=0;
		char opt;
		
		System.out.print("Inserir \"c\" é para o adepto utilizar camisola do clube.\n\nSe Inserir \"n\" é se utilizar roupa normal.\n\nSe inserir \"s\" é para parar.\n\n");

		do{
			System.out.print("Insira a opção: ");
			opt = scan.next().charAt(0);
			if(opt=='c'){
				dinheiroCamisolas+=14;
			    dinheiroBilhetes+=7.5;
				pessoas++;	
			} if(opt=='n'){
				dinheiroBilhetes+=7.5;
				pessoas++;
			}
		}while(opt!='s');
		
		System.out.print("Houve "+pessoas+" bilhetes comprados.\nO dinheiro arrecadado dos bilhetes foi: "+dinheiroBilhetes+"€\nO dinheiro arrecadado das camisolas foi: "+dinheiroCamisolas+"€");
	}
	}


