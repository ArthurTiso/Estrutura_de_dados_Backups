package listaligadasimples;

public class ListaLigadaSimples {
    
    static No inicio = null;
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {

            int x = (int) (Math.random()*30);
            System.out.println("Inserindo: "+x);

            inserir(x);
        }
        
        exibir();
        
        removerUltimo();
        
        exibir();
        
    }
    
    public static void inserir(int x){
        No novo = new No(x);
        
        if(inicio == null)
            inicio = novo;
        else{
            No temp = inicio;
            while(temp.prox != null) //navegação até o final da lista
                temp = temp.prox;
            //aqui temp está no último nó da lista
            temp.prox = novo;
        }
    }
    
    
    public static void exibir(){
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
    
    //Exercício 4.2: Crie um método chamado void removerUltimo() que remove o último elemento da lista
    
    public static void removerUltimo() {
    	
    	if (inicio == null) {
    		System.out.println("Vazio!!!");
    	}
    	else {
    		No temp = inicio;
    		
    		while(temp.prox.prox != null) {
    			temp = temp.prox;
    		}
    			temp.prox = null;
    		
    	}
    	
    }
    
}