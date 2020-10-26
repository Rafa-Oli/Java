package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
   public static void main(String[] args) throws SQLException{
		final String url="jdbc:mysql://localhost:3306/curso_java?useTimezone=true&serverTimezone=America/Sao_Paulo";
		final String usuario="root";
		final String senha="13091997neves.";
		
		//lan�a uma excecao checada(deve ser tratada)
		Connection conexao=DriverManager.getConnection(url, usuario, senha);

		Statement stmt=conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		System.out.println("Banco criado");
	
		conexao.close();
		
}
}
