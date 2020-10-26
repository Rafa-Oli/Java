package Automoveis;

import java.util.ArrayList;
import java.util.List;

import Pessoas.Cliente;
import Pessoas.Funcionario;
import java.util.Scanner;


import BancoDeDados.BancoDeDadosCarro.BancoDeDados;
public class Locação {
	
	private int dias;
	private String finalidade;
	private String locaisTrafego;
	private Carro carroAlugado;
	private Funcionario funcionarioAlugou;
	private Cliente clienteAlugou;
	private List<Opcional> opcionais;
	private String dataLocacao;
	private String diaEntrega;
    Scanner ler = new Scanner(System.in);
	public Locação() {}
    
    public Locação(int dias, String finalidade, String locaisTrafego, Carro carroAlugado, Funcionario funcionarioAlugou) {
        this.dias = dias;
		this.finalidade = finalidade;
		this.locaisTrafego = locaisTrafego;
		this.carroAlugado = carroAlugado;
		this.funcionarioAlugou = funcionarioAlugou;
		this.opcionais = new ArrayList<>();
		this.clienteAlugou = clienteAlugou;
	}
	
	public void cadastro() {
		System.out.println("Digite a quantidade de dias da locação do carro: ");
		int dias = ler.nextInt();
		
		System.out.println("Digite a finalidade da locação do carro: ");
		String finalidade = ler.next();
		
		System.out.println("Digite os locais de tráfego do carro: ");
		String locaisTrafego = ler.next();
		
		
	}
	
	
	public void CalculoLocação() {
		int opcao;
		BancoDeDados bancoCarro = new BancoDeDados();
		Carro carro=new Carro();
		
	   System.out.println("Selecione o carro: ");
	   bancoCarro.Listagem();
	   opcao=ler.nextInt();
	   
	   
	
	   
	   
		 }
		
		
		
	
	

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getlocaisTrafego() {
		return locaisTrafego;
	}

	public void setlocaisTrafego(String locaisTrafego) {
		this.locaisTrafego = locaisTrafego;
	}
	

}
