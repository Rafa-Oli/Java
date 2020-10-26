package Automoveis;

public class Opcional {
	protected String nome;
    protected double valorDiaria;
	
    public Opcional(String nome, double valorDiaria) {
		this.nome=nome;
		this.valorDiaria = valorDiaria;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public double getvalorDiaria() {
		return valorDiaria;
	}

	public void setvalorDiaria(double valorDiaria) {
		this.valorDiaria= valorDiaria;
	}
    
	
}
