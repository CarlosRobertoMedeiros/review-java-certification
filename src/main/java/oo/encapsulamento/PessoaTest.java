package oo.encapsulamento;

public class PessoaTest {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro","Amoedo", -30);
		p1.setIdade(-30);

		System.out.println(p1.getIdade());
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());

	}

}
