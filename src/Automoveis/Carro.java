package Automoveis;

public class Carro {
	private String nome;
	private int ano;
	private String placa;
	private int km;
	private TiposCarros tipoAuto;
	private Boolean estaAlugado;
   
	public Carro() {}

	public Carro(String nome, int ano, String placa, int km) {
        this.nome = nome;
		this.ano = ano;
		this.placa = placa;
		this.km = km;
		this.estaAlugado = false;
	}

	
	private double calculoLocação() {
		switch(this.getTipoAuto()) {
		
		case HATCH:
		    return 70.00;
		case SEDAN:
			return 77.00;
		case SUV:
			return 80.50;
		case MINIVAN:
			return 87.5;
		}
		
}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public TiposCarros getTipoAuto() {
		return tipoAuto;
	}

	public void setTipoAuto(TiposCarros tipoAuto) {
		this.tipoAuto = tipoAuto;
	}
	
	public boolean getEstaAlugado() {
		return this.estaAlugado=false;
	}

	public void setEstaAlugado(Boolean estaAlugado) {
		this.estaAlugado = estaAlugado;
	}

	
}
