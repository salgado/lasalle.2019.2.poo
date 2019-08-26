package org.lasalle.poo.exemplo1;

public class CanetaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta caneta = new Caneta();
		
		//caneta.modelo = "Bic";
		caneta.setModelo("Bic");
		
		caneta.setCor("Verde");
		//caneta.ponta = 0.5f;
		
		//caneta.carga = 50;
		caneta.setCarga(50);
		
		//caneta.tampada = true;
		
		caneta.destampar();
		caneta.escrever();
		
		caneta.tampar();
		caneta.escrever();
		
		System.out.println("Modelo = " + caneta.getModelo());
	}

}
