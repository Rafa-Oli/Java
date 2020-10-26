package Pessoas;


public class PessoaFisica extends Cliente {

	private int CPF;
	private String enderešo;

	
	public PessoaFisica(String nome, int CPF, String enderešo) {
		super(nome);
		this.CPF = CPF;
		this.enderešo = enderešo;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	

}
