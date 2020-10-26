package Pessoas;


public class PessoaFisica extends Cliente {

	private int CPF;
	private String endereço;

	
	public PessoaFisica(String nome, int CPF, String endereço) {
		super(nome);
		this.CPF = CPF;
		this.endereço = endereço;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	

}
