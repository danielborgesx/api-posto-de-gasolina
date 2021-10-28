package br.com.posto.de.gasolina;

import java.util.Scanner;

public class GerenciamentoDoPosto {

	private TanquesDeCombustivel tanques;
	private Vendas vendasEfetuadas;
	private Relatorios relatorio = new Relatorios();

	public void opcoesGerenciamentoDoPosto() {
		String[] gerenciamentoDoPosto = new String[] { "Abastecimento dos Tanques", "Relatório dos tanques",
				"Relatório de vendas", "Relatório de despesas", "Relatório de lucros", "Voltar" };
		System.out.println("Gerenciamento do posto");
		System.out.println();
		for (int i = 0; i < gerenciamentoDoPosto.length; i++) {
			System.out.println("[" + i + "]" + gerenciamentoDoPosto[i]);
		}
	}

	public void abastecerOsTanques() {
		tanques.armazenarOValorAbastecidoAoTanqueRespectivo();
	}

	public void exibirAQuantidadeAtualDeCombustivelNosTanques() {
		relatorio.exibirQuantidadeAtualDeCombustivelNoTanque();
	}

	TanquesDeCombustivel getTanques() {
		return tanques;
	}

	void setTanques(TanquesDeCombustivel tanques) {
		this.tanques = tanques;
	}

	Vendas getVendasEfetuadas() {
		return vendasEfetuadas;
	}

	void setVendasEfetuadas(Vendas vendasEfetuadas) {
		this.vendasEfetuadas = vendasEfetuadas;
	}

	Relatorios getRelatorio() {
		return relatorio;
	}

	void setRelatorio(Relatorios relatorio) {
		this.relatorio = relatorio;
	}

}
