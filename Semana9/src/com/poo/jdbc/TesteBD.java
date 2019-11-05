package com.poo.jdbc;

import java.sql.Connection;

public class TesteBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = ConnectionFactory.getConnection();
		System.out.println("Conexão Ok");

	}

}
