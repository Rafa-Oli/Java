package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	public static Connection getConexao() {
		try {
			// properties serve para externalizar as informa�oes a partir de um arquivo
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
			;

			// lan�a uma excecao checada(deve ser tratada)
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		// ele ir� pegar o arquivo .properties e carregar, por issos e chama load
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}
