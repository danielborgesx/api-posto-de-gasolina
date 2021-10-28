package br.com.posto.de.gasolina;

import java.util.Scanner;

public class MenuPrincipal {
	private GerenciamentoDoPosto gerenciamentoDoPosto = new GerenciamentoDoPosto();
	private Vendas vendas = new Vendas();
	private TanquesDeCombustivel tanques = new TanquesDeCombustivel();
	private Relatorios relatorios = new Relatorios();

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
		Scanner scanner = new Scanner(System.in);
		exibirMenuPrincipal();
		System.out.print("Opção desejada: ");
		Integer opcaoDesejada = scanner.nextInt();
		if (opcaoDesejada == 0) {
			gerenciamentoDoPosto.opcoesGerenciamentoDoPosto();
			System.out.println();
			System.out.print("Opção desejada: ");
			Integer opcaoDoGerenciamento = scanner.nextInt();
			if (opcaoDoGerenciamento == 0) {
				tanques.armazenarOValorAbastecidoAoTanqueRespectivo();
			} else if (opcaoDoGerenciamento == 1) {
				relatorios.exibirQuantidadeAtualDeCombustivelNoTanque();
			} else if (opcaoDoGerenciamento == 2) {

			} else if (opcaoDoGerenciamento == 3) {

			} else if (opcaoDoGerenciamento == 4) {

			} else if (opcaoDoGerenciamento == 5) {
				boot();
			}

		} else if (opcaoDesejada == 2) {
			vendas.exibirOpcoesVendas();
			Integer opcoesDasVendas = scanner.nextInt();
			if (opcoesDasVendas == 1) {
				vendas.abastecerOVeiculoDoCliente(tanques);
			} else if (opcoesDasVendas == 2) {
				int escolhaDoServicoAdicional = vendas.exibirEEscolherTipoDeServicoAdicional();
				vendas.processarASomaEOPagamentoDosServicosAdicionais(escolhaDoServicoAdicional);
			} else if (opcoesDasVendas == 3) {
				boot();
			}

		} else if (opcaoDesejada == 3) {
			System.out.println("Obrigado por usar o programa!");
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

}
