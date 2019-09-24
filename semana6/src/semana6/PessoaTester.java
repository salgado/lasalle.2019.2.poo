package semana6;

public class PessoaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* classe abstrata
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Alex");
		p1.setIdade(20);
		p1.setSexo("M");
		*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Maria");
		a1.setIdade(30);
		a1.setMatricula("005001000");
		a1.setCurso("SI");
		a1.setSexo("F");
		
		Professor prof = new Professor();
		prof.setNome("Marcelo");
		prof.setIdade(35);
		prof.setSexo("M");
		prof.setSalario(1000);
		prof.setEspecialidade("Mestre");
		
		Funcionario func = new Funcionario();
		func.setNome("Luiz");
		func.setSexo("M");
		func.setIdade(40);
		func.setSetor("TI");
		func.setTrabalhando(true);
		func.mudarTrabalho();
		
		Visitante visit = new Visitante();
		visit.setNome("Jose");
		visit.setIdade(10);
		visit.setSexo("M");
		
		Bolsista bolsista = new Bolsista();
		bolsista.setBolsa(100);
		bolsista.setNome("Mario");
		bolsista.setIdade(22);
		
		
		//System.out.println(p1.toString());
		/*
		System.out.println(a1.toString());
		System.out.println(prof.toString());
		System.out.println(func.toString());
		System.out.println(visit.toString());
		System.out.println(bolsista.toString());
		*/
		
		a1.pagarMensalidade(1000);
		bolsista.pagarMensalidade(900);

	}

}
