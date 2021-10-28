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
		System.out.println("Abastecimento");
		System.out.println();
		double quantidadeDeLitrosSubtraidosDoTanque = 0.0;
		for (int i = 0; i < combustiveis.length; i++) {
			quantidadeDeLitrosSubtraidosDoTanque = quantidadeDeCombustivelAbastecido
					/ combustiveis[i].getValorDeVendaDosCombustiveis();

			for (int y = i; y == i + 1; y++) {
				if (capacidadeAtualDoTanqueDeEtanol == 0 || capacidadeAtualDoTanqueDeGasolinaComum == 0
						|| capacidadeAtualDoTanqueDeGasolinaAditivada == 0 || capacidadeAtualDoTanqueDeDiesel == 0) {
					System.out.println("Tanque vazio!!!");
				} else if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeEtanol
						|| quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeGasolinaComum
						|| quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeGasolinaAditivada
						|| quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeDiesel) {
					System.out.println("Não há combustível suficiente!!!");
				} else {
					if (opcaoEscolhida == 0) {
						capacidadeAtualDoTanqueDeEtanol -= quantidadeDeLitrosSubtraidosDoTanque;
					} else if (opcaoEscolhida == 1) {
						capacidadeAtualDoTanqueDeGasolinaComum -= quantidadeDeLitrosSubtraidosDoTanque;
					} else if (opcaoEscolhida == 2) {
						capacidadeAtualDoTanqueDeGasolinaAditivada -= quantidadeDeLitrosSubtraidosDoTanque;
					} else if (opcaoEscolhida == 3) {
						capacidadeAtualDoTanqueDeDiesel -= quantidadeDeLitrosSubtraidosDoTanque;
					}
					System.out.println("Abastecimento feito com sucesso! Foram abastecidos " + Math.round(quantidadeDeLitrosSubtraidosDoTanque));
				}
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