package atividadeCavalo;

public class Tabuleiro {
	int contador = 1;
	int[][] matriz = new int[8][8];
	int linha, coluna, lin, col;
	Cavalo cavalo;
	int random = 0;

	public Tabuleiro(int linhaInicial, int colunaInicial) {
		cavalo = new Cavalo(linhaInicial, colunaInicial);
		matriz[linhaInicial][colunaInicial] = 1;
	}

	public void anda(int contador) {
		int linhaAnterior = cavalo.getLinha();
		int colunaAnterior = cavalo.getColuna();
		geraMovimentoValido();
		int linha = cavalo.getLinha();
		int coluna = cavalo.getColuna();
		if (linha != linhaAnterior && colunaAnterior != coluna) {
			matriz[linha][coluna] = contador;
		}
	}

	public void andaAleatorio(int contador) {
		int liAnterior = cavalo.getLinha();
		int colAnterior = cavalo.getColuna();
		geraMovimentoValidoAleatorio();
		int linha = cavalo.getLinha();
		int coluna = cavalo.getColuna();
		if (linha != liAnterior && colAnterior != coluna) {
			matriz[linha][coluna] = contador;
		}
	}

	public void imprimeTabuleiro() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("  %d  ", matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	private boolean jogadaValida(int linha, int coluna) {
		return linha <= 7 && linha >= 0 && coluna >= 0 && coluna <= 7 && (matriz[linha][coluna] == 0);
	}

	private void geraMovimentoValido() {
		int linhaAtual, colunaAtual;
		linhaAtual = cavalo.getLinha();
		colunaAtual = cavalo.getColuna();
		if (jogadaValida(linhaAtual - 1, colunaAtual + 2)) {
			cavalo.setLinha(linhaAtual - 1);
			cavalo.setColuna(colunaAtual + 2);

		} else if (jogadaValida(linhaAtual + 1, colunaAtual + 2)) {
			cavalo.setLinha(linhaAtual + 1);
			cavalo.setColuna(colunaAtual + 2);

		} else if (jogadaValida(linhaAtual - 1, colunaAtual - 2)) {
			cavalo.setLinha(linhaAtual - 1);
			cavalo.setColuna(colunaAtual - 2);

		} else if (jogadaValida(linhaAtual + 1, colunaAtual - 2)) {
			cavalo.setLinha(linhaAtual + 1);
			cavalo.setColuna(colunaAtual - 2);
		} else if (jogadaValida(linhaAtual - 2, colunaAtual + 1)) {
			cavalo.setLinha(linhaAtual - 2);
			cavalo.setColuna(colunaAtual + 1);
		} else if (jogadaValida(linhaAtual + 2, colunaAtual + 1)) {
			cavalo.setLinha(linhaAtual + 2);
			cavalo.setColuna(colunaAtual + 1);
		} else if (jogadaValida(linhaAtual + 2, colunaAtual - 1)) {
			cavalo.setLinha(linhaAtual + 2);
			cavalo.setColuna(colunaAtual - 1);
		} else if (jogadaValida(linhaAtual - 2, colunaAtual - 1)) {
			cavalo.setLinha(linhaAtual - 2);
			cavalo.setColuna(colunaAtual - 1);
		}

	}
	private void geraMovimentoValidoAleatorio() {
		int linhaAtual, colunaAtual;
		linhaAtual = cavalo.getLinha();
		colunaAtual = cavalo.getColuna();
		random = 1 + (int) (Math.random() * 8);
		switch (random) {
		case 1:
			if (jogadaValida(linhaAtual - 1, colunaAtual + 2)) {
				cavalo.setLinha(linhaAtual - 1);
				cavalo.setColuna(colunaAtual + 2);
			}
			break;
		case 2:
			if (jogadaValida(linhaAtual + 1, colunaAtual + 2)) {
				cavalo.setLinha(linhaAtual + 1);
				cavalo.setColuna(colunaAtual + 2);
			}
			break;
		case 3:
			if (jogadaValida(linhaAtual - 1, colunaAtual - 2)) {
				cavalo.setLinha(linhaAtual - 1);
				cavalo.setColuna(colunaAtual - 2);
			}
			break;
		case 4:
			if (jogadaValida(linhaAtual + 1, colunaAtual - 2)) {
				cavalo.setLinha(linhaAtual + 1);
				cavalo.setColuna(colunaAtual - 2);
			}
			break;
		case 5:
			if (jogadaValida(linhaAtual - 2, colunaAtual + 1)) {
				cavalo.setLinha(linhaAtual - 2);
				cavalo.setColuna(colunaAtual + 1);
			}
			break;
		case 6:
			if (jogadaValida(linhaAtual + 2, colunaAtual + 1)) {
				cavalo.setLinha(linhaAtual + 2);
				cavalo.setColuna(colunaAtual + 1);
			}
			break;
		case 7:
			if (jogadaValida(linhaAtual + 2, colunaAtual - 1)) {
				cavalo.setLinha(linhaAtual + 2);
				cavalo.setColuna(colunaAtual - 1);
			}
			break;
		case 8:
			if (jogadaValida(linhaAtual - 2, colunaAtual - 1)) {
				cavalo.setLinha(linhaAtual - 2);
				cavalo.setColuna(colunaAtual - 1);
			}
			break;
		}
	}

}
