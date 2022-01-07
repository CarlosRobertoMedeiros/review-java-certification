package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		gerarErro1();
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
		
		
	}
	
	// Exceção não checada ou verificada
	static void gerarErro1() {
		throw new RuntimeException("Ocorreu um Erro Em tempo de Execução !");
	}
	
	// Exceção checada ou verificada
	static void gerarErro2() throws Exception{
		throw new Exception("Ocorreu um Erro Em tempo de Compilação !");
	}
	

}
