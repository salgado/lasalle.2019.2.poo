package semana6;

public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho()
	{
		System.out.println(nome +  " mudou de trabalho...");
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	@Override
	public String toString() {
		return super.toString() + "Funcionario [setor=" + setor + ", trabalhando=" + trabalhando + "]";
	}
	
	
	// getters/setter
	
}
