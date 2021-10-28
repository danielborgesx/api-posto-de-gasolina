package br.com.posto.de.gasolina;

public class Combustiveis {
	private String tipoDeCombustivel;
	private double valorDeCustoDosCombustiveis;
	private double valorDeVendaDosCombustiveis;
	
	
	
	public Combustiveis (double valorDeCusto) {
		this.valorDeCustoDosCombustiveis = valorDeCusto;
	}
	
	public Combustiveis (String tipoDeCombustivel, double valorDeVenda) {
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.valorDeVendaDosCombustiveis = valorDeVenda;
	}

	String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	double getValorDeCustoDosCombustiveis() {
		return valorDeCustoDosCombustiveis;
	}

	void setValorDeCustoDosCombustiveis(double valorDeCustoDosCombustiveis) {
		this.valorDeCustoDosCombustiveis = valorDeCustoDosCombustiveis;
	}

	double getValorDeVendaDosCombustiveis() {
		return valorDeVendaDosCombustiveis;
	}

	void setValorDeVendaDosCombustiveis(double valorDeVendaDosCombustiveis) {
		this.valorDeVendaDosCombustiveis = valorDeVendaDosCombustiveis;
	}
	
	
}
