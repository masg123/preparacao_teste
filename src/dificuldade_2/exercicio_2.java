package dificuldade_2;

public class exercicio_2 {
	Scanner read = new Scanner(System.in);
	
	char[] c = new char[5];
	int[] cont = new int[10];
	
	for(int i=0; i<5; i++){
		System.out.println("Insira um caracter: ");
		c[i] = read.next().charAt(0);
		
		switch(c[i]){
		
		case '0': cont[0]++; break;
		case '1': cont[1]++; break;
		case '2': cont[2]++; break;
		case '3': cont[3]++; break;
		case '4': cont[4]++; break;
		case '5': cont[5]++; break;
		case '6': cont[6]++; break;
		case '7': cont[7]++; break;
		case '8': cont[8]++; break;
		case '9': cont[9]++; break;
		
		}
	}
	
	System.out.println("");
	
	for(int i=0; i<10; i++){
		System.out.println(" " + i + " - " + cont[i] + "x");
	}
	
}

}
