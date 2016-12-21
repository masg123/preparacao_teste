package teste;

import java.util.Scanner;

public class exercicio_3 {

	public exercicio_3() {
		
		Scanner scan = new Scanner(System.in);
		int jogo1=0,jogo2=0,jogo3=0,jogo4=0;
		float media=0;
		
		do{
			System.out.print("Golos que foram marcados no primeiro jogo: ");
			jogo1 = scan.nextInt();
		}
		while(jogo1<0);
		
		media+=jogo1;
		
		do{
			System.out.print("Golos que foram marcados no segundo jogo:  ");
			jogo2 = scan.nextInt();
		}
		while(jogo2<0);
		
		media+=jogo2;
		
		do{
			System.out.print("Golos que foram marcados no terceiro jogo:  ");
			jogo3 = scan.nextInt();
		}
		while(jogo3<0);
		
		media+=jogo3;
		
		do{
			System.out.print("Golos que foram marcados no quarto jogo:  ");
			jogo4 = scan.nextInt();
		}
		while(jogo4<0);
		
		media+=jogo4;
		
		media/=4;
		System.out.print("Em media o jogador marcou "+media+" golos por jogo");
	}
}
