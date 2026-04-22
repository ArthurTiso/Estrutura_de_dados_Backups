package Duplamente_ligada_circular;

import Duplamente_ligada.No;

public class Lista {


    static No inicio = null;
    static No ultimo = null;
    
    public static void main(String[] args) {

    	inserirInicio(7);
    	inserirFinal(8);
    	inserirFinal(12);
    	
    	exibir();
    	
    	
    	inserirOrdenado(5);

    	exibir();
    	

    }
    
    static void inserirInicio(int x){
    	 No novo = new No(x);
         
         if(inicio == null) {
             inicio = novo;
         	 inicio.prox = novo;
         	 inicio.ant = novo;
         }
    
         else{
        	 No ultimo = inicio.ant;

             novo.prox = inicio;
             novo.ant = ultimo;

             ultimo.prox = novo;
             inicio.ant = novo;

             inicio = novo;
             }
         
         
//  	inicio.ant = ultimo;
//		
//		inicio.ant = novo;
//		ultimo.prox = novo;
//		
//		novo.prox = inicio;
//		novo.ant = ultimo;
//		
//		
//		novo = inicio;
		
         
    }
    
    static void inserirFinal(int x){
        No novo = new No(x);

        if(inicio == null){
        	 inicio.prox = novo;
         	 inicio.ant = novo;
        }else {
            No ultimo = inicio.ant;

            novo.prox = inicio;
            novo.ant = ultimo;

            ultimo.prox = novo;
            inicio.ant = novo;
        }
        
    }
    
    static void inserirOrdenado(int x){

        No novo = new No(x);

        //  lista vazia
        if(inicio == null){
            inicio = novo;
            inicio.prox = inicio;
            inicio.ant = inicio;
            return;
        }

        //  inserir antes do início
        if(x < inicio.valor){
            No ultimo = inicio.ant;

            novo.prox = inicio;
            novo.ant = ultimo;

            ultimo.prox = novo;
            inicio.ant = novo;

            inicio = novo;
            return;
        }

        No temp = inicio;

        //  percorre até achar posição
        while(temp.prox != inicio && temp.prox.valor < x){
            temp = temp.prox;
        }

        //  inserir no final
        if(temp.prox == inicio){
            No ultimo = inicio.ant;

            novo.prox = inicio;
            novo.ant = ultimo;

            ultimo.prox = novo;
            inicio.ant = novo;
        }
        else{
            //  inserir no meio
            novo.prox = temp.prox;
            novo.ant = temp;

            temp.prox.ant = novo;
            temp.prox = novo;
        }
    }
    static void exibir(){

        if(inicio == null)
            System.out.println("Lista Vazia, nada a exibir.");
        else{
            System.out.println("--- Lista ----");
            No temp = inicio;
            do {
            	 System.out.println(temp.valor);
                 temp = temp.prox;
            } while( temp != inicio);
            
        }
    	
    }

    static void exibirInverso(){
    	 if(inicio == null)
             System.out.println("Lista Vazia, nada a exibir.");
    	 else {
    		 System.out.println("--- Lista Inversa ---");
    		 No temp = inicio.ant;
    		 
    		 do {
    			 System.out.println(temp.valor);
    			 temp = temp.ant;
    		 }while(temp != inicio.ant);
    		 
    		 
//    		 while(temp.prox != null) {
//    			 temp = temp.prox; //Vai até o fim	 
//    	 }
//    	 while (temp != null){
//    		 System.out.println(temp.valor);
//    		 temp = temp.ant;
//    	 }
    }
    	 
    	
   }

    static void remover(int x){

        if(inicio == null) return;

        No temp = inicio;

        do{
            if(temp.valor == x){

                // único elemento ele ja remove aq!
                if(temp.prox == temp){
                    inicio = null;
                    return;
                }

                temp.ant.prox = temp.prox;
                temp.prox.ant = temp.ant;

                if(temp == inicio) // remover caoso esteja no inicio!!
                    inicio = temp.prox;

                return;
            }

            temp = temp.prox;

        } while(temp != inicio);
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

