package BancoDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Automoveis.Opcional;

public class BancoDeDadosOpcionais {
	public static class BancoDeDadosOpcional {
		private static Scanner ler = new Scanner(System.in);
		private static List<Opcional> opcionais = new ArrayList<>();
		int op;

		public void cadastroOpcional() {
		
				System.out.println("Digite o nome do opcional: ");
				String nome = ler.next();

				System.out.println("Digite o valor da  diaria do opcional: ");
				double valorDiaria = ler.nextDouble();

				Opcional opcional = new Opcional(nome, valorDiaria);
				opcionais.add(opcional);


			
		}

		public static void Listagem() {
			for (int i = 0; i < opcionais.size(); i++) {
				System.out.println("Nome do opcional: " + opcionais.get(i).getnome());

			}

		}
	}
}