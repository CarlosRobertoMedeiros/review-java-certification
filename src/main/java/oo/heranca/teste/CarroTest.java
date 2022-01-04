package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

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
		
		Ferrari ferrari = new Ferrari(400);
		ferrari.ligarTurbo();
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
