package com.poo.view;

import java.util.Scanner;

import com.poo.controller.AlunoController;
import com.poo.dao.AlunoDAO;
import com.poo.model.Aluno;

public class AlunoView {

	public void create()
	{
		try
		{	
			Scanner sc = new Scanner(System.in);
			
			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			
			System.out.println("Entre com a matricula:");
			aluno.setMatricula(sc.nextLine());
			
			System.out.println("Entre com o nome:");
			aluno.setNome(sc.nextLine());
			
			controller.create(aluno);

		}
		catch(Exception e)
		{
			System.out.println("Erro na tela de incluir aluno");
		}

	}
	
	public void readAll()
	{
		AlunoController controller = new AlunoController();
		
		System.out.println("Listagem de alunos");
		System.out.println("*******************");
		for(Aluno aluno:controller.readAll())
		{
			System.out.println("Matricula:" + aluno.getMatricula());
			System.out.println("Nome:" + aluno.getNome());
			System.out.println("-------------------------");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoView crud = new AlunoView();
		
		crud.readAll();
	
	 }
}
