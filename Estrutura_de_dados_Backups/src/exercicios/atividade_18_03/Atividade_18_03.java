package atividade_18_03;

public class Atividade_18_03 {

    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        
        p1.empilhar(6);
        
        p1.empilhar(12);
        
        p1.empilhar(13);
        
        p1.empilhar(14);
        
        System.out.println("EXIBIÇÃO DA PILHA ATUAL");
        
        p1.exibir();

        p1.desempilhar();
        
        System.out.println("EXIBIÇÃO DA PILHA SEM NADA");
        
        p1.exibir();
        
        Fila f1 = new Fila();
        
        f1.enfileirar(0);
        
        f1.enfileirar(4);
        
        f1.enfileirar(5);
        	
        System.out.println("EXIBIÇÃO DA FILA ATUAL");
        
        f1.exibir();
        
        f1.desenfileirar();
        
        System.out.println("EXIBIÇÃO FILA SEM NADA");
            
        f1.exibir();
    }    
}
   
