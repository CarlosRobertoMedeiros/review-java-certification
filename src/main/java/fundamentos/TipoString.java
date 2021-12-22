package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("2"=="2");//true
		
		String s = new String("2");
		System.out.println(s =="2");//false
		//Sempre use o equals para comparar Strings
		System.out.println("2".equals(s));//true
		
		
		
		
	}
}
