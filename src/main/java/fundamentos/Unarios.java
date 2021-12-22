package fundamentos;

public class Unarios {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		//Pós fixado
		a++; //a = a + 1;
		a--;//a = a - 1;
		
		//Pré fixado
		++b; //b = b + 1;
		--b; //b = b - 1;
		
		System.out.println("Mini Desafio ...");
		//++a Incrementa e compara
		//b-- Compara b e depois decrementa
		System.out.println(++a == b--); //true
		System.out.println(a == b);//false
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
	}

}
