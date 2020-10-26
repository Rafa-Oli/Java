package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarPessoa {
   public static void main(String[] args) throws SQLException {
	   Scanner entrada = new Scanner(System.in);
	   Connection conexao = FabricaConexao.getConexao();
	   System.out.println("Informe o nome para atualizar: ");
	   String nome = entrada.nextLine();
	   System.out.println("Informe o nome atualizado: ");
	   String nomeAtual = entrada.nextLine();
	   
	   String sql = "UPDATE pessoas set nome = ? WHERE nome = ?";
	   PreparedStatement stmt = conexao.prepareStatement(sql);
	   stmt.setString(1,nomeAtual);
	   stmt.setString(2, nome);
	   stmt.execute();
	  System.out.println("Nome atualizado");
	   
	   conexao.close();
	   entrada.close();
	   
	   
	}
}
