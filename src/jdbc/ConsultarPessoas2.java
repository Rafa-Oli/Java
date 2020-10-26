package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		System.out.println("Informe o valor para consulta: ");
		Scanner entrada = new Scanner(System.in);
		String letra = entrada.nextLine();

		// trazendo informaçoes pra java
		String sql = "SELECT * FROM pessoas where nome like ?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + letra + "%");

		// coloca as informaçoes dentro de uma variavel que é resultado
		ResultSet resultado = stmt.executeQuery();
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
		entrada.close();
	}

}
