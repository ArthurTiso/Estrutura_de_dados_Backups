package Duplamente_ligada;

import listaligadassimples.No;

public class listasDuplamenteLigadas {


    static No inicio = null;
    
    public static void main(String[] args) {


            inserirInicio(4);
            inserirFinal(10);
            inserirFinal(11);
            inserirFinal(12);
            inserirFinal(13);
            inserirFinal(14);
            inserirFinal(15);

            
            exibir();

        
        exibirInverso();
    	

    }
    
    static void inserirInicio(int x){
    	 No novo = new No(x);
         
         if(inicio == null)
             inicio = novo;
         else{
        	novo.prox = inicio;
        	inicio.ant = novo;
        	inicio = novo;
        	     
             }
    }
    
    static void inserirFinal(int x){
        No novo = new No(x);

        if(inicio == null){
            inicio = novo;
            return;
        }

        No temp = inicio;
        while(temp.prox != null)
            temp = temp.prox;

        temp.prox = novo;
        novo.ant = temp;
    }
    
    static void inserirOrdenado(int x){
    	
    	

    }

    static void exibir(){

        if(inicio == null)
            System.out.println("Lista Vazia, nada a exibir.");
        else{
            System.out.println("--- Lista ----");
            No temp = inicio;
            while(temp != null){
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        }
    	
    }

    static void exibirInverso(){
    	 if(inicio == null)
             System.out.println("Lista Vazia, nada a exibir.");
    	 else {
    		 System.out.println("--- Lista Inversa ---");
    		 No temp = inicio;
    		 
    		 while(temp.prox != null) {
    			 temp = temp.prox; //Vai até o fim	 
    	 }
    	 while (temp.ant != null){
    		 System.out.println(temp.valor);
    		 temp = temp.ant;
    	 }
    }
    	 
    	
   }

    static void remover(int x){
    	
    	if(inicio == null) return;
    	 
    	No temp = inicio;
    	 while(temp != null && temp.valor != x){
    	       temp = temp.prox;
    	   }	
    	 System.out.println( "Removendo o " + temp.valor); 
    	  temp.ant.prox = temp.prox;
    	  temp.prox.ant = temp.ant;
    	
    }

    static void removerPrimeiro(){

        if(inicio == null) return;

        System.out.println("Removendo o Primeiro (" + inicio.valor + ")");

        if(inicio.prox == null){
            inicio = null;
        } else {
            inicio = inicio.prox;
            inicio.ant = null;
        }
    }

    static void removerUltimo(){
    	
    	
    	No temp = inicio;
    	while(temp.prox != null) {
    		temp = temp.prox;
    	}
    	System.out.println("Removendo o ultimo, vulgo: " + temp.valor );
    	temp.ant.prox = null;
    	
    		
    }

}
