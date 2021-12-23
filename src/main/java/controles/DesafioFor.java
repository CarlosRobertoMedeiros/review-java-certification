package controles;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor +="#";
		}
		
		//Versão do Desafio
		for (String texto = "#"; !texto.equals("######"); texto +="#") {
			System.out.println(texto);
		}
	}

}
