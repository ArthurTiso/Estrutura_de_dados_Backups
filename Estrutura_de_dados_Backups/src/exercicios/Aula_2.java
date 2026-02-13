package exercicios;

public class Aula_2 {


	 static void ExibeN(int i) {
		 	
		 	if ( i == 1 ) {
		 		System.out.println(i);
		 	}
		 	else {
		 		ExibeN(i-1 );
		 		System.out.println(i);
		 	
		 	}
		 
		 
		  }
	
	 static int Soma(int i) {
		 
		 if (i == 1) {
			 return i;
		 }
		 else {
			 return i + Soma(i-1);
		 }
	 }
	 
	 static int FatorialX(int x) {
		 if (x == 1) {
			 System.out.println(x);
			 return x;
		 }
		 else {
			 System.out.println(x);
			 return x * FatorialX(x - 1);
		 }

	 }
	 
	 static int pot(int x, int n) {
		 if (n == 0) {
			 return 1;
		 }
		 else
		 
		 return x* pot(x, n-1) ;
	 }
	 
	 	 
	 static int SomaVet(int n, int vet[]) {
		 if(n < 0 ) {
		 return 0;
		 }
		 else {
			 
			 return vet[n]+ SomaVet(n-1, vet);
		 }
	 }
	 
	 	
	 	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ExibeN(10);
		
		// int res = Soma(4); System.out.println(res);
		
		//int res = FatorialX(4); System.out.println(res);
		
		// int res = pot(2,3); System.out.println(res);
		
			int[] vetor= { 25,25,25,25 };
			int res = SomaVet(3, vetor); System.out.println(res);
		
		
	}

}
