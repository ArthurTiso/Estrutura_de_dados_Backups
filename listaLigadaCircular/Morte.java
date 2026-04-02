package listaLigadaCircular;


public class Morte {

    static No inicio = null; // <- VARIÁVEL GLOBAL

    public static void main(String[] args) {

        int N = 6;
        int S = 5;

        for (int i = 1; i <= N; i++) {
            insereFinal(i);
        }

        exibir();

        josephus(S);

        System.out.println("JOSEPHUS");
        System.out.println("N = " + N);
        System.out.println("S = " + S);
        System.out.println("Sobrevivente: " + inicio.valor);

    }

    static void insereFinal(int x) {
        No novo = new No(x);

        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;

            while (temp.prox != inicio) {
                temp = temp.prox;
            }

            temp.prox = novo;	
        }
        novo.prox = inicio;
    }

    static void exibir() {
        if (inicio == null) {
            System.out.println("Lista VAZIA, nada a exibir");
        } else {
            No temp = inicio;
            do {
                System.out.println(temp.valor);
                temp = temp.prox;
            } while (temp != inicio);
        }
    }

    static void josephus(int s) {
    	No temp = inicio;
    	int i = 1;
    	while( ) {
    	for( int j = 1; j < s; j++) {
    		temp = temp.prox;
    	}		
    	temp.prox = temp.prox.prox;
    	i++;
    	}
    	inicio = temp;
    }
}