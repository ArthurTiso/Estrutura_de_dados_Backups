package listaLigadaCircular;

public class ListaLigadaCircular {
    
    static No inicio = null;
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 4; i++) {

            int x = (int) (Math.random()*30);
            System.out.println("Inserindo: "+x);

            inserir(x);
        }
        exibir();
        insereInicio(10);
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
    
    public static void insereInicio(int x) { //mexer
    	No novo = new No(x);
    	No temp = inicio;
    	if (temp.prox == null) { //navegando até o penúltimo nó
    		novo.prox = inicio;
    	}
    		else {
    			temp = temp.prox;
    		}
    	}
    	

   
    public static void insereFinal(int x) {
    	No novo = new No(x);
    	
    	No temp = inicio;
    	
    	  while (temp.prox.prox != null) //navegando até o penúltimo nó
              temp = temp.prox;
      
          temp.prox = inicio; 
          
    }
    
    public static void removeInicio(int x) {   	
    inicio = inicio.prox; 	
    }
    
  public static void removeFinal() {
    	
    	if (inicio == null) {
    		System.out.println("Tá VAZIOO");
    	}
    	else {
    		  if (inicio.prox == null)
                  inicio = null;
              else {
                  No temp = inicio;
                  while (temp.prox.prox != null) //navegando até o penúltimo nó
                      temp = temp.prox;
              
                  temp.prox = null; //removendo o último nó
              }
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
 }
    