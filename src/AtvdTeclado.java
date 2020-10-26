
import java.util.*;
import java.io.*;

public class AtvdTeclado {
	public static void main(String Args[]) {

		int numeros[] = new int[8];

		Scanner ler = new Scanner(System.in);
		PrintWriter file = null;
		Random gerador = new Random();

		ArrayList<String> palavras = new ArrayList<String>(); // lista de todas as palavras
		int palavrasComb = 999; // tamanho do vetor
		int iguais = 0; // palavras iguais geradas

		String[][] letras = { { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" }, { "J", "K", "L" },
				{ "M", "N", "O" }, { "P", "Q", "R" }, { "S", "T", "U" }, { "V", "X", "Z" } };
		String temp = "";

		System.out.println("\nDigite 8 valores de entrada entre 2 e 9:");
		for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Nº %d = ", i + 1);
			numeros[i] = ler.nextInt();

		}
		try {
			for (int j = 0; j < palavrasComb; j++) {
				temp = "";
				for (int i = 0; i < numeros.length; i++)
					temp += letras[numeros[i] - 2][gerador.nextInt(3)]; // criação da combinação

				if (!Arrays.stream(palavras.toArray(new String[0])).anyMatch(temp::equals))
					palavras.add(temp); 
				else {
					iguais++;
					j--;
				}
			}

			Collections.sort(palavras.subList(1, palavras.size())); // ordenação do array

			writeln("\nCombinações iguais = " + iguais);
			for (int i = 0; i < palavrasComb; i++) {
				
				System.out.printf("[%d] %s\n",i, palavras.get(i));
				
			
			}
			// Ler os nomes criados
			try {
				file = new PrintWriter(new FileWriter("palavras.txt", true));
				for (int i = 0; i < palavrasComb; i++) {
					file.println((i + 1) + " ---> " + palavras.get(i));
				}
			} catch (FileNotFoundException e) {
				System.err.println("arquivo \"palavras.txt\" nao encontrado");
			} catch (IOException e) {
				System.err.println(e.getMessage());
			} finally {
				file.close();
				ler.close();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Números devem ser entre 2 a 9");
		}
	}

	static void write(String string) {
		System.out.print(string);
	}

	static void writeln(String s) {
		System.out.println(s);
	}
}
