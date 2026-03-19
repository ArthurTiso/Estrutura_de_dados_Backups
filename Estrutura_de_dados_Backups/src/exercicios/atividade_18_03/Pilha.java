package atividade_18_03;

public class Pilha {
    private No topo; // topo é o nó de controle da lista o "início" da implementação anterior
    
    public Pilha(){
        this.topo = null;
    }
    
    public void empilhar(int x){
    	 No novo = new No(x);
         
         if(topo == null)
        	 topo = novo;
         else{
             No temp = topo;
             while(temp.prox != null) //navegação até o final da lista
                 temp = temp.prox;
             //aqui temp está no último nó da lista!
             temp.prox = novo;
         }
    }
    
    public void desempilhar() {

        if (topo == null) {
            System.out.println("Pilha vazia");
            return;
        }

        while( topo != null) {
        No temp = topo;
        No antes = null;

        while (temp.prox != null) {
            antes = temp;
            temp = temp.prox;
        }

        if (antes == null) {
            topo = null; // havia apenas um elemento
        } else {
            antes.prox = null; // remove o último nó
        }
    }
    }        

    public int topo(){
    
        return 0;
    }
    
    public boolean vazia(){
        
        return false;
    }
    
    public int tamanho(){
        
        return 0;
    }
    
    public void exibir(){
    	
    	
        if(topo == null)
            System.out.println("Lista Vazia, nada a exibir.");
        else{
            No temp = topo;
            while(temp != null){
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        }
    }

    }
   
