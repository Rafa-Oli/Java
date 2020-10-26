package BancoDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Pessoas.Funcionario;
import Pessoas.Pessoa;

public class BancoDeDadosFuncionarios {
	public static class BancoDeDadosFuncionario {
		private static Scanner ler = new Scanner(System.in);
		private static List<Funcionario> funcionarios = new ArrayList<>();

		public static void CadastroFuncionarios() {
			System.out.println("Digite o nome do Funcionário: ");
			String nome = ler.next();

			System.out.println("Digite o salário do Funcionário: ");
			double salario = ler.nextInt();
			
			Pessoa funcionario = new Funcionario(nome, salario);
			funcionarios.add((Funcionario) funcionario);
			System.out.println("Cliente cadastrado!");

		}

		public static void Listagem() {
			for (int i = 0; i < funcionarios.size(); i++) {
				System.out.println("Nome do Funcionario: " + funcionarios.get(i).getNome());

			}

		}
	}
}
