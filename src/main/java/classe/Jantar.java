package classe;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Feijão", 0.223);
		Comida c2 = new Comida("Arroz", 0.300);

		Pessoa p1 = new Pessoa("Carlos Roberto", 100.00);
		System.out.println(p1.toString());
		p1.comer(c1);
		p1.comer(c2);
		System.out.println(p1.toString());
	}

}
