package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
public static void main(String[] args) throws SQLException {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Informe o codigo: ");
		int codigo = entrada.nextInt();
		
		Connection conexao= FabricaConexao.getConexao();
		//ou codigo>?, vai pegar todos maiores que o parametro dado
		String sql= "DELETE FROM pessoas WHERE codigo= ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		
		// retorna quantidade de linhas afetadas, se retornar zero é pq n foi afetada, ou seja,n foi exclusa
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		}else {
			System.out.println("Nada feito...");
		}
		
		
			
		conexao.close();
		entrada.close();
		
		
	}
}
