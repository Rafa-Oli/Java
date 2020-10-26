package atividadeCavalo;

public class MainMilPasseios {
	public static void main(String[] args) {
		final int NUM2_MOV_MAX = 1000;
		int random = 0;
		random = 0 + (int) (Math.random() * 8);
		Tabuleiro tabuleiro = new Tabuleiro(random, random);
		tabuleiro.imprimeTabuleiro();

		for (int i = 2; i <= NUM2_MOV_MAX; i++) {
			tabuleiro.anda(i);
			tabuleiro.imprimeTabuleiro();
		}
	}
}