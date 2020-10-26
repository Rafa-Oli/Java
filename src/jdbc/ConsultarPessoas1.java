package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();

		// trazendo informaçoes pra java
		String sql = "SELECT * FROM pessoas";

		Statement stmt = conexao.createStatement();

		// coloca as informaçoes dentro de uma variavel que é resultado
		ResultSet resultado = stmt.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			// pega as colunas a partir do nome da coluna(nome e codigo):

			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));

		}
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ===> " + p.getNome());
		}
		stmt.close();
		conexao.close();
	}
}
