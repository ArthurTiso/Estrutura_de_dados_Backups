package arvoresBi;



public class Main {
	
	static NoA raiz = null;
	public static void main(String[] args) {
		
		inserir(10);
		inserir(12);
		inserir(13);
		inserir(42);
		inserir(8);
		inserir(6);
		inserir(6);
		
		inserirExclusivo(9);
		
	//	mostrarFB(raiz);
		
		exibeArvore(raiz, 0);
		
		raiz = girarEsquerda(raiz);raiz = girarEsquerda(raiz);raiz = girarEsquerda(raiz);
		
		System.out.println("--------------------------------");
		
		exibeArvore(raiz, 0);
		
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
	   
	   	   
	   public static void inserirExclusivo(int x) {
		   
		  if( !existe (x))
			  inserir(x);
		  else System.out.println("Esse valor já está presente");
	   }
	   
	   public static boolean existe(int x) {
		
		   NoA temp = raiz;
		   
		   if (temp == null) return false;
		   
		   if(x == temp.valor) return true;
		   else {
		   
		   while(temp != null) {
			   
			   if(x == temp.valor) return true;
			   else if(x < temp.valor)
				   temp = temp.esq;
			   else if (x > temp.valor ) temp = temp.dir;
		   }
		   
		   return false;
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
	   
	   
	   public static void remover (int x) {
		   if (raiz.valor == x) {
			   if (raiz.esq == null && raiz.dir == null)
				   raiz = null;
			   else { 
				   if (raiz.esq == null && raiz.dir != null)
					   raiz = raiz.dir;
				   else if (raiz.esq != null && raiz.dir == null)
					   raiz = raiz.esq;
				   else
					   remove2filhas(raiz, x);
			   }
		   }
	   }
	   
	   public static void remove2filhas(NoA n, int x) {
		   
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
	   
	   
	   public static int maiorPIA(NoA temp) {
		  
	        if(temp != null){
	            int x = maiorPIA(temp.dir);
	            if(temp.valor > x)
	                return temp.valor;
	            else
	                return x;
	        }
	        return -1;
	    }
	   
	    public static void exibeFolhas(NoA temp){
	        if(temp != null){
	            exibeFolhas(temp.esq);
	            if(ehFolha(temp))
	                System.out.print(temp.valor+" ");
	            exibeFolhas(temp.dir);
	        }
	    }
	   
	    private static int profundidade(NoA temp) {
	        if(temp != null){
	            if(ehFolha(temp))
	                return 0;
	            else{
	                int x = profundidade(temp.esq);
	                int y = profundidade(temp.dir);
	                int r = (x>y)? x : y;
	                return r+1;
	            }
	        }
	        return -1;
	    }
	   
	    private static int tamanho(NoA temp) {
	        if(temp != null)
	            return 1+tamanho(temp.esq)+tamanho(temp.dir);

	        return 0;
	     }
	   
	   public static boolean ehFolha(NoA temp) {
		   if((temp.esq == null) && (temp.dir==null))
	            return true;
	        return false;
	   }
	   
	   public static void mostrarFB(NoA raiz){
		   
		   NoA temp = raiz;
		   if(temp != null){
			   
			 mostrarFB(temp.esq);
			 int esq = profundidade(temp.esq);
			 int dir = profundidade(temp.dir);
			 int fb = esq - dir;
			 System.out.println( temp.valor + " -> FB = " + fb );
			 mostrarFB(temp.dir);
			  
			   
		   }
		   
	   }
	   
	   
	   public static boolean ehAVL(NoA N) {
		return false;
		   
	   }
	   
	  public static int fatorBalanceamento(NoA n) {
		return 0;
		  
	  }
	  
	  public static NoA girarDireita(NoA x){
	        NoA y = x.esq; //Seja Y o filho à esquerda de X
	        x.esq = y.dir; // Torne o filho à direita de Y o filho à esquerda de X.
	        y.dir = x; // Torne X o filho à direita de Y
	        return y;
	    }

	    public static NoA girarEsquerda(NoA x){
	        NoA y = x.dir; //Seja Y o filho à direita de X
	        x.dir = y.esq; // Torne o filho à esquerda de Y o filho à direita de X.
	        y.esq = x; // Torne X o filho à esquerda de Y
	        return y;
	    }
	    
}

