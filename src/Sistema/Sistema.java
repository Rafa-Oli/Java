package Sistema;

import Automoveis.Locação;
import BancoDeDados.BancoDeDadosCarro;
import BancoDeDados.BancoDeDadosCarro.BancoDeDados;
import BancoDeDados.BancoDeDadosClientes.BancoDeDadosCliente;
import BancoDeDados.BancoDeDadosFuncionarios;
import BancoDeDados.BancoDeDadosFuncionarios.BancoDeDadosFuncionario;
import BancoDeDados.BancoDeDadosOpcionais.BancoDeDadosOpcional;
import Console.Console;

public class Sistema {
	public static void main(String[] args) {
		int opcao;

		BancoDeDados bancoCarro = new BancoDeDados();
		BancoDeDadosCliente bancoCliente = new BancoDeDadosCliente();
		BancoDeDadosFuncionario bancoFuncionario = new BancoDeDadosFuncionario();
		BancoDeDadosOpcional bancoOpcional= new BancoDeDadosOpcional();
		Locação locação= new Locação();
		
		Console console = new Console();

		while (true) {
			opcao = console.Menu();

			switch (opcao) {
			case 1:
				bancoCarro.CadastraCarro();
				break;
			case 2:
				bancoOpcional.cadastroOpcional();
				bancoOpcional.Listagem();
				break;
			case 3:
				bancoCliente.cadastroCliente();
				break;
			case 4:
				bancoFuncionario.CadastroFuncionarios();
				break;
			case 5:
				
				locação.CalculoLocação();
				break;
			case 6:
				break;
			}
		}
	}
}