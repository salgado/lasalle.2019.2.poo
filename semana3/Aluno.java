package org.lasalle.poo.exemplo1;

public class Aluno {
	private String matricula;
	private String nome;
	private String curso;
	private String faculdade;
	
	//construtor
	public Aluno()
	{
		this.faculdade = "Unilasalle-RJ";
	}
	
	public Aluno(String fac)
	{
		this.faculdade = fac;
	}
	
	//metodos getters/setters
	public String getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		
		if (curso.equalsIgnoreCase("si"))
			this.curso = "Sistemas de Informação";
		else
			this.curso = curso;
	}
	
	public void listar()
	{
		System.out.println("Matricula = " + this.getMatricula());
		System.out.println("Nome = " + this.getNome());
		System.out.println("Curso = " + this.getCurso());
		System.out.println("Faculdade = " + this.getFaculdade());
	}
}
