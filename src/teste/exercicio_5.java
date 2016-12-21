package teste;

import java.util.Scanner;

public class exercicio_5 {

	public exercicio_5() {
		
		int[] array = {5,2,7};
		int produto=0;
		
		for(int i=0; i<3; i++){
			if(i==0)
				produto=array[i];		
			else{
				produto*=10;
				produto+=array[i];
			}
		}
		
		System.out.print("Produto: "+produto);
	}
		
		
		
	}


