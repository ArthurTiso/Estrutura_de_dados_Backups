package primos;

import java.util.Scanner;

import atividade_18_03.No;


public class Primos {

 static No inicio = null; // <- VARIÁVEL GLOBAL
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o valor de N: ");
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            inserir(i);
        }
        primos(N);
        
        exibir(inicio);
        System.out.println("Existem "+tamanho(inicio)+" numeros primos entre 0 e "+N);
    }
    
    private static void primos(int n){
    	No temp = inicio;
    	
    	while( temp.prox != null) {
    		if( temp != null && ( temp.valor == 0 || temp.valor == 1)){
    			temp = temp.prox;
    		}else if( temp.prox.valor % temp.valor == 0 ) {
    			temp.prox = temp.prox.prox;
    			
    		
    		}else {
    			temp.prox = temp.prox.prox;
    		}

    	}
    	
    }
    
    private static int tamanho(No temp){
    	
    	int i = 0;
    	if(inicio == null)
            System.out.println("Lista Vazia, nada a exibir.");
        else{
        while( temp != null) {
        	
        	temp = temp.prox;
        	i += 1;
        }
       }
        return i;
    }    
    
    
    private static void inserir(int x) {
     
    	No novo = new No(x);
        
        if(inicio == null)
       	 inicio  = novo;
        else{
            No temp = inicio ;
            while(temp.prox != null) //navegação até o final da lista
                temp = temp.prox;
            //aqui temp está no último nó da lista!
            temp.prox = novo;
        }
    	
    }
        
    private static void exibir(No tempo) {
    	
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
    }
    