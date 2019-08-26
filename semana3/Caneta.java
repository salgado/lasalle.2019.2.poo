package org.lasalle.poo.exemplo1;

public class Caneta {
	
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void setModelo(String m)
	{
		this.modelo = m;
	}
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	public void escrever()
	{
		if(this.tampada)
			System.out.println("Erro! Não consigo escrever!");
		else
			System.out.println("Escrevendo...");
	}

	public void tampar()
	{
		this.tampada = true;
	}
	
	public void destampar()
	{
		this.tampada = false;
	}
}
