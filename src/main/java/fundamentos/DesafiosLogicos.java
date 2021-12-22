package fundamentos;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho2 = false;
		boolean trabalho1 = false;
		
		boolean comprouTV50polegadas = trabalho1 && trabalho2;
		boolean comprouTV32polegadas = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete; //Operador Unário
		
		System.out.println("Comprou TV 50\"? "+comprouTV50polegadas);
		System.out.println("Comprou TV 32\"? "+comprouTV32polegadas);
		System.out.println("Comprou TV 32\"Sorvete? "+comprouSorvete);
		System.out.println("Mais Saudável"+ maisSaudavel);
		
		
	}

}
