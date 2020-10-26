package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//forma de leo
public class AlterarPessoa {
   public static void main(String[] args) throws SQLException {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Informe o código da pessoa: ");
		int codigo= entrada.nextInt();
		
		
		String select= "SELECT codigo,nome FROM pessoas WHERE codigo = ?";
		String update= "UPDATE pessoas SET nome = ? WHERE codigo= ?";
		
		
		Connection conexao= FabricaConexao.getConexao();
		PreparedStatement stmt= conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		//retorna um obj
		ResultSet r= stmt.executeQuery();
		
		if(r.next()) {
			//coluna 1: codigo, coluna 2: nome
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			System.out.println("O nome atual é: " + p.getNome());
			
			System.out.println("Informe o nome: ");
			String novoNome= entrada.next();
            
			stmt.close();	
            stmt= conexao.prepareStatement(update);
            stmt.setString(1,novoNome);
            stmt.setInt(2, codigo);
            stmt.execute();
			
		}else {
			System.out.println("Pessoa não encontrada!");
		}
		conexao.close();
	    entrada.close();
	    System.out.println("Pessoa atualizada com sucesso!");
	   
	}
}
