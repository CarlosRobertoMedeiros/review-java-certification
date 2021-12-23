package controles;

public class For1 {
	
	public static void main(String[] args) {
		for(int contador = 0; contador <=20 ; contador+=2) {
			System.out.printf("contador = %d\n", contador);
		}
	
		//Assim também compila
		int x = 2;
		for(; x<10;) {
			System.out.println("x = "+x);
			x++;
		}
		
		//Laço Infinito
//		for(;;) {
//			System.out.println("Laço Infinito ");
//		}
		
		//Laço Infinito 2 
//		for(;true;) {
//			System.out.println("Laço Infinito ");
//		}
	
	}

}
