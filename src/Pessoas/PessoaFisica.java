package Pessoas;


public class PessoaFisica extends Cliente {

	private int CPF;
	private String endere�o;

	
	public PessoaFisica(String nome, int CPF, String endere�o) {
		super(nome);
		this.CPF = CPF;
		this.endere�o = endere�o;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	

}
