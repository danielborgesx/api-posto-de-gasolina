package br.com.posto.de.gasolina;

import java.util.Scanner;

public class MenuPrincipal {
	private GerenciamentoDoPosto gerenciamentoDoPosto = new GerenciamentoDoPosto();

	private Vendas vendas = new Vendas();

	private TanquesDeCombustivel tanques = new TanquesDeCombustivel();

	private Relatorios relatorios = new Relatorios();

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

	public static void exibirMenuPrincipal() {
		Scanner scanner = new Scanner(System.in);
		String[] opcoesMenuPrincipal = new String[] { "Gerenciamento do posto", "Vendas", "Sair" };
		System.out.println("Menu Principal");
		System.out.println();
		System.out.println("Escolha uma opção abaixo:");
		for (int i = 0; i < opcoesMenuPrincipal.length; i++) {
			System.out.println("[" + i + "]" + opcoesMenuPrincipal[i]);
		}
	}

	public void boot() {
		exibirMenuPrincipal();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Opção desejada: ");
		Integer opcaoDesejada = scanner.nextInt();
		System.out.println();
		if (opcaoDesejada == 0) {
			gerenciamentoDoPosto.opcoesGerenciamentoDoPosto();
			System.out.println();
			System.out.print("Opção desejada: ");
			Integer opcaoDoGerenciamento = scanner.nextInt();
			System.out.println();
			if (opcaoDoGerenciamento == 0) {
				tanques.armazenarOValorAbastecidoAoTanqueRespectivo(gerenciamentoDoPosto, combustiveis);
				System.out.println();
				boot();
			} else if (opcaoDoGerenciamento == 1) {
				relatorios.exibirQuantidadeAtualDeCombustivelNoTanque(tanques);
				System.out.println();
				boot();
			} else if (opcaoDoGerenciamento == 2) {
				relatorios.exibirRelatorioDeVendasDeCombustivel(combustiveis, tanques);
				System.out.println("Relatório de serviços adicionais comprados");
				System.out.println();
				relatorios.exibirRelatorioDeVendasDeServicosAdicionais(servicosAdicionais, vendas);
				System.out.println();
				boot();
			} else if (opcaoDoGerenciamento == 3) {
				relatorios.exibirRelatorioDeDespesasDeCombustivel(combustiveis, tanques);
				System.out.println();
				boot();
			} else if (opcaoDoGerenciamento == 4) {
				
				relatorios.exibirRelatorioDeLucrosBrutosDosServicosAdicionais(servicosAdicionais, vendas);
				System.out.println();
				boot();
			} else if (opcaoDoGerenciamento == 5) {
				System.out.println();
				boot();
			}

		} else if (opcaoDesejada == 1) {
			vendas.exibirOpcoesVendas();
			System.out.print("Opção desejada: ");
			Integer opcoesDasVendas = scanner.nextInt();
			System.out.println();
			if (opcoesDasVendas == 0) {
				int escolhaDoCliente = vendas.exibirEEscolherTipoDeCombustivelParaVenda(combustiveis);
				double valorParaAbastecimento = vendas.exibirEInformarValorParaAbastecimentoDoCarroDoCliente();
				tanques.subtrairOValorAbastecidoPeloClienteDaCapacidadeDoTanque(escolhaDoCliente,
						valorParaAbastecimento, combustiveis);
				System.out.println();
				boot();
			} else if (opcoesDasVendas == 1) {
				int escolhaDoCliente = vendas.exibirEEscolherTipoDeServicoAdicional(servicosAdicionais);
				vendas.processarASomaEOPagamentoDosServicosAdicionais(escolhaDoCliente, servicosAdicionais);
				System.out.println();
				boot();
			} else if (opcoesDasVendas == 2) {
				System.out.println();
				boot();
			}
		} else if (opcaoDesejada == 2) {
			System.out.println();
			System.out.println("Obrigado por usar o programa!!!");
			System.exit(0);
		}
	}

	GerenciamentoDoPosto getGerenciamentoDoPosto() {
		return gerenciamentoDoPosto;
	}

	void setGerenciamentoDoPosto(GerenciamentoDoPosto gerenciamentoDoPosto) {
		this.gerenciamentoDoPosto = gerenciamentoDoPosto;
	}

	Vendas getVendas() {
		return vendas;
	}

	void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}

	TanquesDeCombustivel getTanques() {
		return tanques;
	}

	void setTanques(TanquesDeCombustivel tanques) {
		this.tanques = tanques;
	}

	Relatorios getRelatorios() {
		return relatorios;
	}

	void setRelatorios(Relatorios relatorios) {
		this.relatorios = relatorios;
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

	Combustiveis[] getCombustiveis() {
		return combustiveis;
	}

	void setCombustiveis(Combustiveis[] combustiveis) {
		this.combustiveis = combustiveis;
	}

	ServicosAdicionais[] getServicosAdicionais() {
		return servicosAdicionais;
	}

	void setServicosAdicionais(ServicosAdicionais[] servicosAdicionais) {
		this.servicosAdicionais = servicosAdicionais;
	}

}
