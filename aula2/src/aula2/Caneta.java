package aula2;

public class Caneta {
	
	//criacao de atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void rabiscar()
	{
		if(tampada)
		{
			System.out.println("Erro! Não consigo rabiscar");
		}
		else
		{
			System.out.println("Rabiscando...");
		}
	}
	
	void tampar()
	{
		
	}

	void destampar()
	{
		
	}
	
	void status()
	{
		System.out.println("Classe Caneta");
		System.out.println("Cor:" + cor);
		System.out.println("Tampada: " + tampada);
		System.out.println("Modelo: " + modelo);
	}
}
