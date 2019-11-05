package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Aluno;

public class AlunoDAO {
	
	public void create(Aluno aluno)
	{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into aluno(matricula, nome) values (?, ?)";
		
		try{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getMatricula());
			stmt.setString(2, aluno.getNome());
			
			stmt.executeUpdate();
			System.out.println("Aluno incluido com sucesso!!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir aluno");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	
	}

	public List<Aluno> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select matricula, nome from aluno";
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Aluno aluno = new Aluno();
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));
				
				alunos.add(aluno);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler tabela aluno");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return alunos;
	}
}
