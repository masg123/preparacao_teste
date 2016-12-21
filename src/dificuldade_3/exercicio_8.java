package dificuldade_3;

public class exercicio_8 {

	
    //------------------Variaveis----------------------
    Random rand = new Random();
    Scanner reader = new Scanner(System.in); 
    int numAleatorio = rand.nextInt(20), cont=0,aux;
    boolean acabou=false;
    char opt;
    //--------------------------------------------------
    
    do{
        System.out.println("Numero "+numAleatorio);
        System.out.println("O proximo numero será:");
        System.out.println("c-Para maior");
        System.out.println("b-Para menor");
        
        opt=reader.next().charAt(0);
        aux=numAleatorio;
        
        //---------Confirmar que o proximo numero nao seja igual------------
        do
        numAleatorio=rand.nextInt(20);
        while(numAleatorio==aux);
        //------------------------------------------------------------------
        
         System.out.println("Proximo numero é:"+numAleatorio);
         
        if(opt=='c'&& numAleatorio>aux){
            cont++;
            System.out.println("Voce acertou!!");
            System.out.println("Total pontos:"+cont);
        }            
        if(opt=='c'&& numAleatorio<aux){
           System.out.println("Voce errou!!");
           acabou=true;
        }
        
        
        if(opt=='b'&& numAleatorio<aux){
            cont++;
            System.out.println("Voce acertou!!");
            System.out.println("Total pontos:"+cont);
        }
        if(opt=='b'&& numAleatorio>aux){
           System.out.println("Voce errou!!");
           acabou=true;
        }
        
        
        
        
    }while(acabou!=true);
    System.out.println("O jogo acabou!!");
    System.out.println("Voce acertou "+cont+" vezes");
}

}
