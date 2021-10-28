package br.com.posto.de.gasolina;

public class ServicosAdicionais {
	private String nomeDoServico;
	private double valorDoServico;
	
	public ServicosAdicionais(String nomeDoServico, double valorDoServico) {
		this.nomeDoServico = nomeDoServico;
		this.valorDoServico = valorDoServico;
	}

	String getNomeDoServico() {
		return nomeDoServico;
	}

	void setNomeDoServico(String nomeDoServico) {
		this.nomeDoServico = nomeDoServico;
	}

	double getValorDoServico() {
		return valorDoServico;
	}

	void setValorDoServico(double valorDoServico) {
		this.valorDoServico = valorDoServico;
	}
	
	
}
