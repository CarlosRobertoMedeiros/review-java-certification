package fundamentos;

public class Relacionais {
	
	public static void main(String[] args) {
			
		int a = 97; //Essa Conversão para Hexadecimal gera o unicode 0061
		int b = 'a';
		System.out.println('\u0061'); //Unicode 0061 equivale a letra a minuscula
		
		System.out.println(a==b); //true
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? "+temDesconto);
		
		
	}

}
