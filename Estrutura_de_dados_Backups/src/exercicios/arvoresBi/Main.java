package arvoresBi;



public class Main {
	
	static NoA raiz = null;
	public static void main(String[] args) {
		
		inserir(10);
		inserir(12);
		inserir(13);
		inserir(42);
		inserir(9);
		inserir(6);
		inserir(6);
		
		maior(raiz);
		menor(raiz);
	}

	
	   public static void inserir(int x){
	        NoA novo = new NoA(x);
	        
	        if(raiz == null)
	            raiz = novo;
	        
	        else{
	            
	            NoA temp = raiz;
	            boolean inseriu = false;
	            
	            while(!inseriu){
	                if(novo.valor <= temp.valor){
	                    if(temp.esq == null){
	                        temp.esq = novo;
	                        inseriu = true;
	                    }else{
	                        temp = temp.esq;
	                    }
	                }else{
	                    if(temp.dir == null){
	                        temp.dir = novo;
	                        inseriu = true;
	                    }else{
	                        temp = temp.dir;
	                    }
	                }
	            }
	        }
	    }
	   
	   
	   public static void exibir(NoA temp){
	        if(temp != null){
	            //TENTE MUDAR A ORDEM DAS 3 LINHAS ABAIXO 
	            exibir(temp.esq);
	            System.out.println(temp.valor);
	            exibir(temp.dir);
	        }
	    }

	   static void exibeArvore(NoA n, int x){

	        if(n.dir != null)
	            exibeArvore(n.dir, x+1);
	        else
	            System.out.println();

	        for(int i=1; i<=x; i++)
	            System.out.print("|  ");
	        
	        if((n.esq == null)&&(n.dir == null))
	            System.out.print("["+n.valor+"]");
	        else
	            System.out.print(n.valor);
	   
	        if(n.esq != null)
	            exibeArvore(n.esq, x+1);
	        else
	            System.out.println();
	        
	    }
	   
	   static int maior (NoA n) { // retorna o maior valor que existe na árvore
		   
		NoA temp = raiz;
		   
		if(raiz == null) {
			System.out.println("Árvore vazia, não há maior valor");
			return 0;
		}
		else {
			while(temp.dir != null) {
				temp = temp.dir;
			}System.out.println(temp.valor);
			
			return 0;
		}
		   
	   }
	   
	   static int menor (NoA n) { // retorna o menor valor que existe na árvore
		   
			NoA temp = raiz;
			   
			if(raiz == null) {
				System.out.println("Árvore vazia, não há maior valor");
				return 0;
			}
			else {
				while(temp.esq != null) {
					temp = temp.esq;
				}System.out.println(temp.valor);
				
				return 0;
			}
	   }
	   
	   static void exibeFolhas(NoA n) { //exibe todas as folhas da árvore em ordem crescente
		   
		   
	   }
	   
	   int profundidade(NoA n) { //retorna a profundidade da árvore
		   
		   
		   
		   return 0;
	   }
	   
	   int tamanho(NoA n) { // retorna a quantidade de nós existente na árvore
		   
		   
		   
		   return 0;
	   }
			   
	   
	  
}


