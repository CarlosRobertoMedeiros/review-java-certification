package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 10;
		d1.mes = 12;
		d1.ano = 2021;
		
		var d2 = new Data(); //Inferência
		d2.dia = 05;
		d2.mes = 07;
		d2.ano = 2018;
		
		System.out.printf(" %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf(" %d/%d/%d", d2.dia, d2.mes, d2.ano);
		
	}

}
