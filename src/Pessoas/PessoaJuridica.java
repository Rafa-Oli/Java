package Pessoas;

public class PessoaJuridica extends Cliente {
	protected int CNPJ;

	public PessoaJuridica(String nome, int CNPJ) {
		super(nome);
		this.CNPJ = CNPJ;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	
}