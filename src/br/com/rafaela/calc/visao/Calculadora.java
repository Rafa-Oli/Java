package br.com.rafaela.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	public Calculadora() {
		organizarLayout();
		setSize(366, 545);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	private void organizarLayout() {
		// tem 3 componentes: teclado,botão,display
		
		setLayout(new BorderLayout());

		Display display = new Display();
		// recebeu o add por herança ja que esta extends Jframe
		// esta adicionando o componente display no norte baseado num layout
		display.setPreferredSize(new Dimension(233, 130));
		add(display, BorderLayout.NORTH);

		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
