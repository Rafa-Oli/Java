package BancoDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Pessoas.Cliente;
import Pessoas.PessoaFisica;
import Pessoas.PessoaJuridica;

public class BancoDeDadosClientes {
	public static class BancoDeDadosCliente {
		private static Scanner ler = new Scanner(System.in);
		private static List<Cliente> clientes = new ArrayList<>();

		public static void cadastroCliente() {
			System.out.println("Pessoa: ");
			System.out.println("1-Fisica ");
			System.out.println("2-Juridica ");
			int op = ler.nextInt();
			if (op == 1) {
				System.out.println("Digite o nome do cliente: ");
				String nome = ler.next();

				System.out.println("Digite o CPF do cliente: ");
				int CPF = ler.nextInt();

				System.out.println("Digite o endereço do cliente: ");
				String endereço = ler.next();

				Cliente cliente = new PessoaFisica(nome, CPF, endereço);
				clientes.add(cliente);
				System.out.println("Cliente cadastrado!");
			} else {
				System.out.println("Digite o nome do cliente: ");
				String nome = ler.next();

				System.out.println("Digite o CPF do cliente: ");
				int CNPJ = ler.nextInt();

				Cliente cliente = new PessoaJuridica(nome, CNPJ);
				clientes.add(cliente);
				System.out.println("Cliente cadastrado!");
			}

		}

		public static void Listagem() {
			for (int i = 0; i < clientes.size(); i++) {
				System.out.println("Nome do cliente: " + clientes.get(i).getNome());

			}

		}
	}
}
