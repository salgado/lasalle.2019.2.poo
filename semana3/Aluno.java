package org.lasalle.poo.exemplo1;

public class Aluno {
	private String matricula;
	private String nome;
	private String curso;
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
		this.curso = curso;
	}
	
	public void listar()
	{
		System.out.println("Matricula = " + this.getMatricula());
		System.out.println("Nome = " + this.getNome());
		System.out.println("Curso = " + this.getCurso());
	}
}
