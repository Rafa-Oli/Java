package br.com.rafaela.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.rafaela.calc.modelo.Memoria;
import br.com.rafaela.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	//responsavel pelo texto no panel
    private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().AdicionarObservador(this);
//		setBackground(new Color(46, 49, 50));
		setBackground(new Color(230,230, 230));
		 label= new JLabel(Memoria.getInstancia().getTextoAtual());
		 //cor da fonte
		 label.setForeground(Color.BLACK);
		 //tipo da fonte, tam
		 label.setFont(new Font("courier", Font.PLAIN, 50));
		 //alinhamentoao lado direito
		 setLayout(new FlowLayout(FlowLayout.RIGHT,10,35));
		 add(label);
		
		}
	
	
	@Override
	public void valorAterado(String NovoValor) {
		label.setText(NovoValor);
		
	}
}
