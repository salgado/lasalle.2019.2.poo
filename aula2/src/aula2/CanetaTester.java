package aula2;

public class CanetaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caneta c1;
		
		c1 = new Caneta();
		c1.cor = "vermelho";
		c1.tampada = true;
		c1.modelo = "Bic";
		
		//c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor = "verde";
		c2.tampada = false;
		c2.modelo = "Compactor";
		
		c2.rabiscar();

	}

}
