package Console;

import java.util.Scanner;

public class Console {
	private int op;
	Scanner entrada = new Scanner(System.in);

	public Console() {}

	public Console(int op) {
        this.op = op;
}

	public int Menu() {

		System.out.println("           Menu          ");
		System.out.println("1-Cadastro de Automóveis");
		System.out.println("2-Cadastro de Opcionais");
		System.out.println("3-Cadastro de Clientes");
		System.out.println("4-Cadastro de Funcionários");
		System.out.println("5-Cadastro de Locação");
		System.out.println("6-Cadastro de Vistoria");
		System.out.print("Opção: ");
		return op = entrada.nextInt();

	}
}
