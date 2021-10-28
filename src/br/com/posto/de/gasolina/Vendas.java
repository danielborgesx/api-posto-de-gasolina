package br.com.posto.de.gasolina;

import java.util.Scanner;

public class Vendas {

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
		double resultadoDaOperacao = 0.0;
		String resposta = "";
		if (opcaoEscolhida == 0) {
			resultadoDaOperacao += servicosAdicionais[0].getValorDoServico();
		} else if (opcaoEscolhida == 1) {
			resultadoDaOperacao += servicosAdicionais[1].getValorDoServico();
		} else if (opcaoEscolhida == 2) {
			resultadoDaOperacao += servicosAdicionais[2].getValorDoServico();
		} else if (opcaoEscolhida == 3) {
			resultadoDaOperacao += servicosAdicionais[3].getValorDoServico();
		}
		System.out.println("O valor para pagamento até o momento é de: " + resultadoDaOperacao);
		System.out.println();
		System.out.print("Deseja mais algum produto? Digite [S] para Sim e [N] para Não: ");
		resposta = scanner.next();
		while (resposta.equalsIgnoreCase("S")) {
			System.out.println();
			exibirEEscolherTipoDeServicoAdicional(servicosAdicionais);
			if (opcaoEscolhida == 0) {
				resultadoDaOperacao += servicosAdicionais[0].getValorDoServico();
			} else if (opcaoEscolhida == 1) {
				resultadoDaOperacao += servicosAdicionais[1].getValorDoServico();
			} else if (opcaoEscolhida == 2) {
				resultadoDaOperacao += servicosAdicionais[2].getValorDoServico();
			} else if (opcaoEscolhida == 3) {
				resultadoDaOperacao += servicosAdicionais[3].getValorDoServico();
			}

			System.out.println("O valor para pagamento até o momento é de: " + resultadoDaOperacao);
			System.out.println();
			System.out.print("Deseja mais algum produto? Digite [S] para Sim e [N] para Não");
			System.out.println();
			resposta = scanner.next();

			if (resposta.equalsIgnoreCase("N")) {

				System.out.println("O valor paga final pagamento até é de: " + resultadoDaOperacao);
				System.out.println();
				System.out.println("Processando o pagamento...");
				System.out.println();
				System.out.println("Obrigado!");
				System.out.println();
			}
		}
	}
}
