package br.com.posto.de.gasolina;

import java.util.Scanner;

public class Vendas {

	private double resultadoDaOperecaoDuchaEcologica;
	private double resultadoDaOperacaoTrocaDeOleo;
	private double resultadoDaOperacaoBalaceamento;
	private double resultadoDaOperacaoCafe;
	private int quantidadeDeOperacoesDuchaEcologica;
	private int quantidadeDeOperacoesTrocaDeOleo;
	private int quantidadeDeOperacoesBalanceamento;
	private int quantidadeDeOperacoesCafe;

	public void exibirOpcoesVendas() {
		String[] vendas = new String[] { "Abastecimento", "Serviços", "Voltar" };
		System.out.println("Vendas");
		System.out.println();
		for (int i = 0; i < vendas.length; i++) {
			System.out.println("[" + i + "]" + vendas[i]);
		}
	}

	public int exibirEEscolherTipoDeCombustivelParaVenda(Combustiveis[] combustiveis) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < combustiveis.length; i++) {
			System.out.println("[" + i + "]" + combustiveis[i].getTipoDeCombustivel() + " Valor: "
					+ combustiveis[i].getValorDeVendaDosCombustiveis());
		}
		System.out.println();
		System.out.print("Escolha o tipo de combustível: ");
		int escolhaDoCombustivel = scanner.nextInt();
		return escolhaDoCombustivel;
	}

	public double exibirEInformarValorParaAbastecimentoDoCarroDoCliente() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Escolha a quantidade em reais (R$) que deseja abastecer: ");
		double quantidadeDeLitros = scanner.nextDouble();
		return quantidadeDeLitros;
	}

	public int exibirEEscolherTipoDeServicoAdicional(ServicosAdicionais[] servicosAdicionais) {
		System.out.println("Servicos Adicionais");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < servicosAdicionais.length; i++) {
			System.out.println("[" + i + "]" + servicosAdicionais[i].getNomeDoServico() + " Valor: "
					+ servicosAdicionais[i].getValorDoServico());
		}
		System.out.println();
		System.out.print("Escolha serviço que deseja comprar: ");
		int escolhaDoServicoAdicional = scanner.nextInt();
		return escolhaDoServicoAdicional;
	}

	public void processarASomaEOPagamentoDosServicosAdicionais(int opcaoEscolhida,
			ServicosAdicionais[] servicosAdicionais) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeDeCompras = 1;
		double resultadoDaOperacao = 0.0;
		String resposta = "";
		if (opcaoEscolhida == 0) {
			resultadoDaOperacao = servicosAdicionais[0].getValorDoServico();
			this.resultadoDaOperecaoDuchaEcologica += resultadoDaOperacao;
			this.quantidadeDeOperacoesDuchaEcologica += quantidadeDeCompras;
		} else if (opcaoEscolhida == 1) {
			resultadoDaOperacao = servicosAdicionais[1].getValorDoServico();
			this.resultadoDaOperacaoTrocaDeOleo += resultadoDaOperacao;
			this.quantidadeDeOperacoesTrocaDeOleo += quantidadeDeCompras;
		} else if (opcaoEscolhida == 2) {
			resultadoDaOperacao = servicosAdicionais[2].getValorDoServico();
			this.resultadoDaOperacaoBalaceamento += quantidadeDeCompras;
			this.quantidadeDeOperacoesBalanceamento += quantidadeDeCompras;
		} else if (opcaoEscolhida == 3) {
			resultadoDaOperacao = servicosAdicionais[3].getValorDoServico();
			this.resultadoDaOperacaoCafe += resultadoDaOperacao;
			this.quantidadeDeOperacoesCafe = quantidadeDeCompras;
		}
		double resultadoFinalDaOperacao = 0.0;
		resultadoFinalDaOperacao += resultadoDaOperacao;
		System.out.println("O valor para pagamento até o momento é de: " + resultadoFinalDaOperacao);
		System.out.println();
		System.out.print("Deseja mais algum produto? Digite [S] para Sim e [N] para Não: ");
		resposta = scanner.next();
		while (resposta.equalsIgnoreCase("S")) {
			System.out.println();
			int opcaoEscolhidaParaSoma = exibirEEscolherTipoDeServicoAdicional(servicosAdicionais);
			if (opcaoEscolhidaParaSoma == 0) {
				resultadoDaOperacao = servicosAdicionais[0].getValorDoServico();
				this.resultadoDaOperecaoDuchaEcologica += resultadoDaOperacao;
				this.quantidadeDeOperacoesDuchaEcologica += quantidadeDeCompras;
			} else if (opcaoEscolhidaParaSoma == 1) {
				resultadoDaOperacao = servicosAdicionais[1].getValorDoServico();
				this.resultadoDaOperacaoTrocaDeOleo += resultadoDaOperacao;
				this.quantidadeDeOperacoesTrocaDeOleo += quantidadeDeCompras;
			} else if (opcaoEscolhidaParaSoma == 2) {
				resultadoDaOperacao = servicosAdicionais[2].getValorDoServico();
				this.resultadoDaOperacaoBalaceamento += quantidadeDeCompras;
				this.quantidadeDeOperacoesBalanceamento += quantidadeDeCompras;
			} else if (opcaoEscolhidaParaSoma == 3) {
				resultadoDaOperacao = servicosAdicionais[3].getValorDoServico();
				this.resultadoDaOperacaoCafe += resultadoDaOperacao;
				this.quantidadeDeOperacoesCafe = quantidadeDeCompras;
			}
			resultadoFinalDaOperacao += resultadoDaOperacao;
			System.out.println("O valor para pagamento até o momento é de: " + resultadoFinalDaOperacao);
			System.out.println();
			System.out.print("Deseja mais algum produto? Digite [S] para Sim e [N] para Não: ");
			resposta = scanner.next();

			if (resposta.equalsIgnoreCase("N")) {

				System.out.println("O valor paga final pagamento até é de: " + resultadoFinalDaOperacao);
				System.out.println();
				System.out.println("Processando o pagamento...");
				System.out.println();
				System.out.println("Obrigado!");
				System.out.println();
			}
		}
	}

	double getResultadoDaOperecaoDuchaEcologica() {
		return resultadoDaOperecaoDuchaEcologica;
	}

	void setResultadoDaOperecaoDuchaEcologica(double resultadoDaOperecaoDuchaEcologica) {
		this.resultadoDaOperecaoDuchaEcologica = resultadoDaOperecaoDuchaEcologica;
	}

	double getResultadoDaOperacaoTrocaDeOleo() {
		return resultadoDaOperacaoTrocaDeOleo;
	}

	void setResultadoDaOperacaoTrocaDeOleo(double resultadoDaOperacaoTrocaDeOleo) {
		this.resultadoDaOperacaoTrocaDeOleo = resultadoDaOperacaoTrocaDeOleo;
	}

	double getResultadoDaOperacaoBalaceamento() {
		return resultadoDaOperacaoBalaceamento;
	}

	void setResultadoDaOperacaoBalaceamento(double resultadoDaOperacaoBalaceamento) {
		this.resultadoDaOperacaoBalaceamento = resultadoDaOperacaoBalaceamento;
	}

	double getResultadoDaOperacaoCafe() {
		return resultadoDaOperacaoCafe;
	}

	void setResultadoDaOperacaoCafe(double resultadoDaOperacaoCafe) {
		this.resultadoDaOperacaoCafe = resultadoDaOperacaoCafe;
	}

	int getQuantidadeDeOperacoesDuchaEcologica() {
		return quantidadeDeOperacoesDuchaEcologica;
	}

	void setQuantidadeDeOperacoesDuchaEcologica(int quantidadeDeOperacoesDuchaEcologica) {
		this.quantidadeDeOperacoesDuchaEcologica = quantidadeDeOperacoesDuchaEcologica;
	}

	int getQuantidadeDeOperacoesTrocaDeOleo() {
		return quantidadeDeOperacoesTrocaDeOleo;
	}

	void setQuantidadeDeOperacoesTrocaDeOleo(int quantidadeDeOperacoesTrocaDeOleo) {
		this.quantidadeDeOperacoesTrocaDeOleo = quantidadeDeOperacoesTrocaDeOleo;
	}

	int getQuantidadeDeOperacoesBalanceamento() {
		return quantidadeDeOperacoesBalanceamento;
	}

	void setQuantidadeDeOperacoesBalanceamento(int quantidadeDeOperacoesBalanceamento) {
		this.quantidadeDeOperacoesBalanceamento = quantidadeDeOperacoesBalanceamento;
	}

	int getQuantidadeDeOperacoesCafe() {
		return quantidadeDeOperacoesCafe;
	}

	void setQuantidadeDeOperacoesCafe(int quantidadeDeOperacoesCafe) {
		this.quantidadeDeOperacoesCafe = quantidadeDeOperacoesCafe;
	}
	
	
}
