package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException{
		//final String url="jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		//ou:
		final String url="jdbc:mysql://localhost:3306/mysql?useTimezone=true&serverTimezone=America/Sao_Paulo";
		final String usuario="root";
		final String senha="13091997neves.";
		
		//lança uma excecao checada(deve ser tratada)
		Connection conexao=DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
		
	}
}
