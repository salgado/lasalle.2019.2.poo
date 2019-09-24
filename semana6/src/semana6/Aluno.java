package semana6;

public class Aluno extends Pessoa {
	
	private String matricula;
	private String curso;
	
	public void cancelarMatricula()
	{
		System.out.println("Matricula cancelada com sucesso!!!");
	}
	
	public void pagarMensalidade(float valor)
	{
		System.out.println("Obrigado!, valor recebido = " + valor);
		System.out.println("Valor mensalidade = " + valor);
	}

	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
