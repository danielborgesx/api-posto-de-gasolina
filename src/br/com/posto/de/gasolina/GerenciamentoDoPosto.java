package br.com.posto.de.gasolina;

import java.util.Scanner;

public class GerenciamentoDoPosto {

	private TanquesDeCombustivel tanques = new TanquesDeCombustivel();
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

	public int exibirEEscolherTipoDeCombustivelParaAbastecimentoDoTanque() {
		Scanner scanner = new Scanner(System.in);
		String[] tipoDeCombustivel = new String[] { "Etanol", "Gasolina Comum", "Gasolina Aditivada", "Diesel" };
		for (int i = 0; i < tipoDeCombustivel.length; i++) {
			System.out.println("[" + i + "] " + tipoDeCombustivel[i]);
		}
		System.out.println();
		System.out.print("Escolha o tipo de combustível para abastecimento do tanque: ");
		int escolhaDoCombustivel = scanner.nextInt();
		return escolhaDoCombustivel;
	}

	public double informarQuantidadeDeLitrosParaAbastecimentoDoTanque() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Escolha a quantidade de combustível que deseja abastecer: ");
		double quantidadeDeLitros = scanner.nextDouble();
		return quantidadeDeLitros;
	}

	public void abastecerOsTanques() {
		int escolhaDoCliente = exibirEEscolherTipoDeCombustivelParaAbastecimentoDoTanque();
		tanques.armazenarOValorAbastecidoAoTanqueRespectivo(escolhaDoCliente,
				informarQuantidadeDeLitrosParaAbastecimentoDoTanque());
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
