package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		JFrame janela= new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    janela.setSize(600, 200);
	    janela.setLayout(new FlowLayout());
	janela.setLocation(null);
	    
	    JButton botao= new JButton("clicar!!");
	    janela.add(botao);
	    
	    botao.addActionListener(e -> System.out.println("O evento ocorreu"));
	    janela.setVisible(true);
	}
	
}
