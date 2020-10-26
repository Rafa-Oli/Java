package BancoDeDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Automoveis.Carro;
import Automoveis.TiposCarros;

public class BancoDeDadosCarro {
	public static class BancoDeDados {

		private static Scanner ler = new Scanner(System.in);
		private static List<Carro> carros = new ArrayList<>();

		public static void CadastraCarro() {
			System.out.println("Digite o nome do carro: ");
			String nome = ler.next();

			System.out.println("Digite o ano do carro: ");
			int ano = ler.nextInt();

			System.out.println("Digite a placa do carro: ");
			String placa = ler.next();

			System.out.println("Digite o quilometragem do carro: ");
			int km = ler.nextInt();

			Carro carro = new Carro(nome, ano, placa, km);

			// Setando tipo do carro:
			System.out.println("Digite o tipo do carro: ");
			System.out.println("1-HATCH ");
			System.out.println("2-SEDAN ");
			System.out.println("3-SUV ");
			System.out.println("4-MINIVAN ");

			int op = ler.nextInt();

			switch (op) {
			case 1:
				carro.setTipoAuto(TiposCarros.HATCH);
				break;
			case 2:
				carro.setTipoAuto(TiposCarros.SEDAN);
				break;
			case 3:
				carro.setTipoAuto(TiposCarros.SUV);
				break;
			case 4:
				carro.setTipoAuto(TiposCarros.MINIVAN);
				break;
			}
			carros.add(carro);
			System.out.println("Carro cadastrado!");
	

		
		}
		public static void Listagem() {
		
			for (int i = 0; i < carros.size(); i++) {
				System.out.printf("%d-Nome do carro: %s\n" ,i, carros.get(i).getNome());
				System.out.println("Tipo do carro: " + carros.get(i).getTipoAuto());
                }
			
		}
		
		public static void Tipagem() {
			
		}

	}

}