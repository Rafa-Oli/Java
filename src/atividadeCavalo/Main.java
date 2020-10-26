package atividadeCavalo;
//Questão 1
public class Main {
	public static void main(String[] args) {
		
		final int NUM_MOV_MAX = 64;
        Tabuleiro tabuleiro = new Tabuleiro(3, 4);
        tabuleiro.imprimeTabuleiro();

		for (int i = 2; i <= NUM_MOV_MAX; i++) {
			tabuleiro.anda(i);
			tabuleiro.imprimeTabuleiro();
		}

	}
}