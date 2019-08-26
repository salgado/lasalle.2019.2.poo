package org.lasalle.poo.exemplo1;

public class AlunoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno al = new Aluno();

		al.setMatricula("00500");
		al.setNome("Alex");
		al.setCurso("SI");
		
		//listar valores
		al.listar();
	}

}
