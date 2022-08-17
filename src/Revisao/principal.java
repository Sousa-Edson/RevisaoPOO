package Revisao;

public class principal {

	public static void main(String[] args) {
		 Carro c1 = new Carro();
		 c1.modelo="Fusca";
		 
		 Carro c2 = new Carro();
		 c2.modelo="Passat";
		 c1.cor="Azul";
		 c1.ano="1977";
		 c2.ano="1982";
		 
		 System.out.println(c1.Acelera(10));
		 System.out.println(c1.Freia(2));
	}

}
