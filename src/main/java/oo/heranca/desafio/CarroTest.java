package oo.heranca.desafio;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro civic = new Civic();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		
		Carro ferrari = new Ferrari();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		
	}
}
