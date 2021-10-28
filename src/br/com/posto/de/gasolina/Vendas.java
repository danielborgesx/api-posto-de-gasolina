package br.com.posto.de.gasolina;

import java.util.Scanner;

public class Vendas {
	private Combustiveis etanol = new Combustiveis("Etanol", 1.19, 2.39);
	private Combustiveis gasolinaComum = new Combustiveis("Gasolina Comum", 2.19, 3.49);
	private Combustiveis gasolinaAditivada = new Combustiveis("Gasolina Aditivada", 2.29, 3.69);
	private Combustiveis diesel = new Combustiveis("Diesel", 1.39, 2.89);

	private Combustiveis[] combustiveis = { etanol, gasolinaComum, gasolinaAditivada, diesel };

	private ServicosAdicionais duchaEcologica = new ServicosAdicionais("Ducha Ecológica", 8.00);
	private ServicosAdicionais trocaDeOleo = new ServicosAdicionais("Troca de Óleo", 50.00);
	private ServicosAdicionais balanceamento = new ServicosAdicionais("Balanceamento", 35.00);
	private ServicosAdicionais cafe = new ServicosAdicionais("Café", 2.00);

	private ServicosAdicionais[] servicosAdicionais = { duchaEcologica, trocaDeOleo, balanceamento, cafe };

	public void exibirOpcoesVendas() {
		String[] vendas = new String[] { "Abastecimento", "Serviços", "Voltar" };
		System.out.println("Vendas");
		System.out.println();
		for (int i = 0; i < vendas.length; i++) {
			System.out.println("[" + i + "]" + vendas[i]);
		}
	}

	public int exibirEEscolherTipoDeCombustivelParaVenda() {
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

	public double exibirEInformarQuantidadeDeLitrosParaAbastecimentoDoCarroDoCliente() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Escolha a quantidade em reais (R$) que deseja abastecer: ");
		double quantidadeDeLitros = scanner.nextDouble();
		return quantidadeDeLitros;
	}

	public int exibirEEscolherTipoDeServicoAdicional() {
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

	public void abastecerOVeiculoDoCliente(TanquesDeCombustivel tanques) {
		int escolhaDoCliente = exibirEEscolherTipoDeCombustivelParaVenda();
		tanques.subtrairOValorAbastecidoPeloClienteDaCapacidadeDoTanque(escolhaDoCliente,
				exibirEInformarQuantidadeDeLitrosParaAbastecimentoDoCarroDoCliente());
	}

	public void processarASomaEOPagamentoDosServicosAdicionais(int opcaoEscolhida) {
		Scanner scanner = new Scanner(System.in);
		double resultadoDaOperacao = 0.0;
		opcaoEscolhida = exibirEEscolherTipoDeServicoAdicional();
		String resposta = "";
		do {
			if (opcaoEscolhida == 1) {
				resultadoDaOperacao += servicosAdicionais[0].getValorDoServico();
			} else if (opcaoEscolhida == 2) {
				resultadoDaOperacao += servicosAdicionais[1].getValorDoServico();
			} else if (opcaoEscolhida == 3) {
				resultadoDaOperacao += servicosAdicionais[2].getValorDoServico();
			} else if (opcaoEscolhida == 4) {
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
		} while (resposta.equalsIgnoreCase("S"));
	}

	Combustiveis getEtanol() {
		return etanol;
	}

	void setEtanol(Combustiveis etanol) {
		this.etanol = etanol;
	}

	Combustiveis getGasolinaComum() {
		return gasolinaComum;
	}

	void setGasolinaComum(Combustiveis gasolinaComum) {
		this.gasolinaComum = gasolinaComum;
	}

	Combustiveis getGasolinaAditivada() {
		return gasolinaAditivada;
	}

	void setGasolinaAditivada(Combustiveis gasolinaAditivada) {
		this.gasolinaAditivada = gasolinaAditivada;
	}

	Combustiveis getDiesel() {
		return diesel;
	}

	void setDiesel(Combustiveis diesel) {
		this.diesel = diesel;
	}

	Combustiveis[] getCombustiveis() {
		return combustiveis;
	}

	void setCombustiveis(Combustiveis[] combustiveis) {
		this.combustiveis = combustiveis;
	}

	ServicosAdicionais getDuchaEcologica() {
		return duchaEcologica;
	}

	void setDuchaEcologica(ServicosAdicionais duchaEcologica) {
		this.duchaEcologica = duchaEcologica;
	}

	ServicosAdicionais getTrocaDeOleo() {
		return trocaDeOleo;
	}

	void setTrocaDeOleo(ServicosAdicionais trocaDeOleo) {
		this.trocaDeOleo = trocaDeOleo;
	}

	ServicosAdicionais getBalanceamento() {
		return balanceamento;
	}

	void setBalanceamento(ServicosAdicionais balanceamento) {
		this.balanceamento = balanceamento;
	}

	ServicosAdicionais getCafe() {
		return cafe;
	}

	void setCafe(ServicosAdicionais cafe) {
		this.cafe = cafe;
	}

	ServicosAdicionais[] getServicosAdicionais() {
		return servicosAdicionais;
	}

	void setServicosAdicionais(ServicosAdicionais[] servicosAdicionais) {
		this.servicosAdicionais = servicosAdicionais;
	}

}
