package br.com.posto.de.gasolina;

public class TanquesDeCombustivel {
	private final double CAPACIDADE_MAXIMA_TANQUES = 20000;
	private double capacidadeAtualDoTanqueDeEtanol;
	private double capacidadeAtualDoTanqueDeGasolinaComum;
	private double capacidadeAtualDoTanqueDeGasolinaAditivada;
	private double capacidadeAtualDoTanqueDeDiesel;

	public void armazenarOValorAbastecidoAoTanqueRespectivo(GerenciamentoDoPosto gerenciamento) {
		int opcaoEscolhida = gerenciamento.exibirEEscolherTipoDeCombustivelParaAbastecimentoDoTanque();
		double quantidadeDeCombustivelAbastecido = gerenciamento.informarQuantidadeDeLitrosParaAbastecimentoDoTanque();
		if (capacidadeAtualDoTanqueDeEtanol > CAPACIDADE_MAXIMA_TANQUES
				|| capacidadeAtualDoTanqueDeGasolinaComum > CAPACIDADE_MAXIMA_TANQUES
				|| capacidadeAtualDoTanqueDeGasolinaAditivada > CAPACIDADE_MAXIMA_TANQUES
				|| capacidadeAtualDoTanqueDeDiesel > CAPACIDADE_MAXIMA_TANQUES) {
			System.out.println("O valor excede a capacidade do tanque!");
		} else if (opcaoEscolhida == 0) {
			capacidadeAtualDoTanqueDeEtanol += quantidadeDeCombustivelAbastecido;
		} else if (opcaoEscolhida == 1) {
			capacidadeAtualDoTanqueDeGasolinaComum += quantidadeDeCombustivelAbastecido;
		} else if (opcaoEscolhida == 2) {
			capacidadeAtualDoTanqueDeGasolinaAditivada += quantidadeDeCombustivelAbastecido;
		} else if (opcaoEscolhida == 3) {
			capacidadeAtualDoTanqueDeDiesel += quantidadeDeCombustivelAbastecido;
		}
	}

	public void subtrairOValorAbastecidoPeloClienteDaCapacidadeDoTanque(int opcaoEscolhida,
			double quantidadeDeCombustivelAbastecido, Vendas vendas, Combustiveis[] combustiveis) {
		System.out.println();
		System.out.println("Processando o abastecimento...");
		System.out.println();
		double quantidadeDeLitrosSubtraidosDoTanque = 0.0;
		for (int i = 0; i != opcaoEscolhida + 1; i++) {
			quantidadeDeLitrosSubtraidosDoTanque = quantidadeDeCombustivelAbastecido
					/ combustiveis[i].getValorDeVendaDosCombustiveis();
		}
		if (opcaoEscolhida == 1) {
			
			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeEtanol) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeEtanol == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				capacidadeAtualDoTanqueDeEtanol -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: " + Math.round(quantidadeDeLitrosSubtraidosDoTanque));
				System.out.println();
			}
		} else if (opcaoEscolhida == 2) {
			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeGasolinaComum) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeGasolinaComum == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				capacidadeAtualDoTanqueDeGasolinaComum -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: " + Math.round(quantidadeDeLitrosSubtraidosDoTanque));
				System.out.println();
			}
		} else if (opcaoEscolhida == 3) {
			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeGasolinaAditivada) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeGasolinaAditivada == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				capacidadeAtualDoTanqueDeGasolinaAditivada -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: " + Math.round(quantidadeDeLitrosSubtraidosDoTanque));
				System.out.println();
			}
		} else if (opcaoEscolhida == 4) {
			
			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeDiesel) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeDiesel == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				capacidadeAtualDoTanqueDeDiesel -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: " + Math.round(quantidadeDeLitrosSubtraidosDoTanque));
				System.out.println();
			}
		}
	}

	double getCapacidadeAtualDoTanqueDeEtanol() {
		return capacidadeAtualDoTanqueDeEtanol;
	}

	void setCapacidadeAtualDoTanqueDeEtanol(double capacidadeAtualDoTanqueDeEtanol) {
		this.capacidadeAtualDoTanqueDeEtanol = capacidadeAtualDoTanqueDeEtanol;
	}

	double getCapacidadeAtualDoTanqueDeGasolinaComum() {
		return capacidadeAtualDoTanqueDeGasolinaComum;
	}

	void setCapacidadeAtualDoTanqueDeGasolinaComum(double capacidadeAtualDoTanqueDeGasolinaComum) {
		this.capacidadeAtualDoTanqueDeGasolinaComum = capacidadeAtualDoTanqueDeGasolinaComum;
	}

	double getCapacidadeAtualDoTanqueDeGasolinaAditivada() {
		return capacidadeAtualDoTanqueDeGasolinaAditivada;
	}

	void setCapacidadeAtualDoTanqueDeGasolinaAditivada(double capacidadeAtualDoTanqueDeGasolinaAditivada) {
		this.capacidadeAtualDoTanqueDeGasolinaAditivada = capacidadeAtualDoTanqueDeGasolinaAditivada;
	}

	double getCapacidadeAtualDoTanqueDeDiesel() {
		return capacidadeAtualDoTanqueDeDiesel;
	}

	void setCapacidadeAtualDoTanqueDeDiesel(double capacidadeAtualDoTanqueDeDiesel) {
		this.capacidadeAtualDoTanqueDeDiesel = capacidadeAtualDoTanqueDeDiesel;
	}

	double getCAPACIDADE_MAXIMA_TANQUES() {
		return CAPACIDADE_MAXIMA_TANQUES;
	}

}