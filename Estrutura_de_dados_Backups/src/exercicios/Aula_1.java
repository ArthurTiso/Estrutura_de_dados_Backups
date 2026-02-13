package exercicios;


import java.util.Random;
import java.util.Scanner;


public class Aula_1 {

	//Atividades:
	//1 - Crie um programa em que solicita ao usuário o valor de N e, posteriormente os N números que devem ser armazenados em um vetor. Em um segundo momento, exiba o vetor na ordem em que os elementos foram digitados e em ordem inversa.
	//2- Crie um programa em JAVA que solicita ao usuário o valor de N e, posteriormente, alimente o vetor com valores aleatórios entre 0 e M (M também é informado pelo usuário). Exiba o vetor gerado.
	
	
	public static void Insere_Exclusivo(int vet[], int n) {
		System.out.println("Insira o numero de elementos aleatorios");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		int i = 0;
		
		while(i != n)
		vet[i] = 10;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        int size;
	        int numeros;
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Insira o tamanho do vetor: ");
	        size = scanner.nextInt();
	        
	        int array[] = new int[size]; 

	        System.out.println("Size do array: " + array.length);
	        
	        
	        int i = 0;
	        while(i != size) {
	        System.out.println("Insira o " + (i+1) + "° numero" );
	        numeros = scanner.nextInt();
	        array[i] = numeros;
	        
	        i++;
	        }
	        
	        System.out.println("VALORES NA ORDEM NORMAL");
	        i = 0;
	        while(i != size) {
	        	
	        	System.out.println("\n");
	        	System.out.println("Valor na posição "+ (i+1) + ": " + array[i] );
	        	i++;
	        }
	        
        	System.out.println("\n");
        	System.out.println("VALORES NA ORDEM REVERSA");

	        i = size;
	        while(i != 0) {

	        	System.out.println("\n");
	        	System.out.println("Valor na posição "+ (i-1) + ": " + array[i-1] );
	        	i--;
	        }
	        
	        System.out.println("VALORES EM ORDEM ALEATORIA: ");
	        
	        i = 0;
	        Random random = new Random();
	        while (i != size) {
	        	
	        	
	        	int randomNumber = random.nextInt(size);
	        	
	        	System.out.println("\n");
	        	System.out.println(""+(i+1) + "° Valor aleatorio: " + array[randomNumber]);
	        	
	        	i++;
	        	
	        }
	        
	        
	        
	        
	        
	}

}