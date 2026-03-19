package atividade_18_03;

public class Fila {
    private No cabeca; // cabeca é o nó de controle da lista o "início" da implementação anterior
    
    public Fila(){
        this.cabeca = null;
    }
    
    public void enfileirar(int x){
    	 No novo = new No(x);
         
         if(cabeca == null)
        	 cabeca  = novo;
         else{
             No temp = cabeca ;
             while(temp.prox != null) //navegação até o final da lista
                 temp = temp.prox;
             //aqui temp está no último nó da lista!
             temp.prox = novo;
         }
    }
    
    public void desenfileirar(){
    	if (cabeca == null) 
            System.out.println("Lista VAZIA, impossível remover !");
        else while(cabeca.prox != null) cabeca = cabeca.prox;
           
            }
  
    
    public int cabeca(){
        
        return 0;
    }
    
    public int cauda(){
        
        return 0;
    }
    
    public boolean vazia(){
        
        return false;
    }
    
    public int tamanho(){
        
        return 0;
    }
    
    public void exibir(){ 
    	
    	
    	if(cabeca == null)
            System.out.println("Lista Vazia, nada a exibir.");
        else{
            System.out.println("--- Lista ----");
            No temp = cabeca;
            while(temp != null){
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        }
   
    }
    
}
