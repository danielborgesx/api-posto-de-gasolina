package br.com.posto.de.gasolina;

public class TanquesDeCombustivel {
	private final double CAPACIDADE_MAXIMA_TANQUES = 20000;
	private double capacidadeAtualDoTanqueDeEtanol;
	private double capacidadeAtualDoTanqueDeGasolinaComum;
	private double capacidadeAtualDoTanqueDeGasolinaAditivada;
	private double capacidadeAtualDoTanqueDeDiesel;
	private double valorArrecadadoCompraDeEtanol;
	private double valorArrecadadoCompraDeGasolinaComum;
	private double valorArrecadadoCompraDeGasolinaAditivada;
	private double valorArrecadadoCompraDeDiesel;
	private double valorDeAbatecimentoEtanol;
	private double valorDeAbatecimentoGasolinaComum;
	private double valorDeAbatecimentoGasolinaAditivada;
	private double valorDeAbatecimentoDiesel;

	public void armazenarOValorAbastecidoAoTanqueRespectivo(GerenciamentoDoPosto gerenciamento, Combustiveis[] combustiveis) {
		int opcaoEscolhida = gerenciamento.exibirTipoDeCombustivelParaAbastecimentoDoTanque();
		double quantidadeDeCombustivelAbastecido = gerenciamento.informarQuantidadeDeLitrosParaAbastecimentoDoTanque();
		double valorDeAbastecimentoDoTanque = 0.0; 
		for(int i = 0; i < combustiveis.length; i++) {
			if (opcaoEscolhida == 0) {
				valorDeAbastecimentoDoTanque = quantidadeDeCombustivelAbastecido / combustiveis[i].getValorDeCustoDosCombustiveis();
				break;
			} else if (opcaoEscolhida == 1) {
				valorDeAbastecimentoDoTanque = quantidadeDeCombustivelAbastecido / combustiveis[i].getValorDeCustoDosCombustiveis();
				break;
			} else if (opcaoEscolhida == 2) {
				valorDeAbastecimentoDoTanque = quantidadeDeCombustivelAbastecido / combustiveis[i].getValorDeCustoDosCombustiveis();
				break;
			} else if (opcaoEscolhida == 3) {
				valorDeAbastecimentoDoTanque = quantidadeDeCombustivelAbastecido / combustiveis[i].getValorDeCustoDosCombustiveis();
				break;
			} 
		}
		if (capacidadeAtualDoTanqueDeEtanol > CAPACIDADE_MAXIMA_TANQUES
				|| capacidadeAtualDoTanqueDeGasolinaComum > CAPACIDADE_MAXIMA_TANQUES
				|| capacidadeAtualDoTanqueDeGasolinaAditivada > CAPACIDADE_MAXIMA_TANQUES
				|| capacidadeAtualDoTanqueDeDiesel > CAPACIDADE_MAXIMA_TANQUES) {
			System.out.println("O valor excede a capacidade do tanque!");
		} else if (opcaoEscolhida == 0) {
			capacidadeAtualDoTanqueDeEtanol += quantidadeDeCombustivelAbastecido;
			this.valorArrecadadoCompraDeEtanol += valorDeAbastecimentoDoTanque;
		} else if (opcaoEscolhida == 1) {
			capacidadeAtualDoTanqueDeGasolinaComum += quantidadeDeCombustivelAbastecido;
			this.valorArrecadadoCompraDeGasolinaComum += valorDeAbastecimentoDoTanque;
		} else if (opcaoEscolhida == 2) {
			capacidadeAtualDoTanqueDeGasolinaAditivada += quantidadeDeCombustivelAbastecido;
			this.valorArrecadadoCompraDeGasolinaAditivada += valorDeAbastecimentoDoTanque;
		} else if (opcaoEscolhida == 3) {
			capacidadeAtualDoTanqueDeDiesel += quantidadeDeCombustivelAbastecido;
			this.valorArrecadadoCompraDeDiesel += valorDeAbastecimentoDoTanque;
		}
		do {
			System.out.println();
			System.out.println("Tanque abastecido com sucesso!");
		} while (opcaoEscolhida != 0 && opcaoEscolhida > 3);
	}

	public void subtrairOValorAbastecidoPeloClienteDaCapacidadeDoTanque(int opcaoEscolhida,
			double quantidadeDeCombustivelAbastecido, Combustiveis[] combustiveis) {
		System.out.println();
		System.out.println("Processando o abastecimento...");
		System.out.println();
		double quantidadeDeLitrosSubtraidosDoTanque = 0.0;
		for (int i = 0; i != opcaoEscolhida + 1; i++) {
			quantidadeDeLitrosSubtraidosDoTanque = quantidadeDeCombustivelAbastecido
					/ combustiveis[i].getValorDeVendaDosCombustiveis();
		}
		if (opcaoEscolhida == 0) {

			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeEtanol) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeEtanol == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				this.valorDeAbatecimentoEtanol += quantidadeDeCombustivelAbastecido;
				capacidadeAtualDoTanqueDeEtanol -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: "
						+ Math.round(quantidadeDeLitrosSubtraidosDoTanque) + " litros.");
				System.out.println();
			}
		} else if (opcaoEscolhida == 1) {
			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeGasolinaComum) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeGasolinaComum == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				this.valorDeAbatecimentoGasolinaComum += quantidadeDeCombustivelAbastecido;
				capacidadeAtualDoTanqueDeGasolinaComum -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: "
						+ Math.round(quantidadeDeLitrosSubtraidosDoTanque) + " litros.");
				System.out.println();
			}
		} else if (opcaoEscolhida == 2) {
			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeGasolinaAditivada) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeGasolinaAditivada == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				this.valorDeAbatecimentoGasolinaAditivada += quantidadeDeCombustivelAbastecido;
				capacidadeAtualDoTanqueDeGasolinaAditivada -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: "
						+ Math.round(quantidadeDeLitrosSubtraidosDoTanque) + " litros.");
				System.out.println();
			}
		} else if (opcaoEscolhida == 3) {

			if (quantidadeDeLitrosSubtraidosDoTanque > capacidadeAtualDoTanqueDeDiesel) {
				System.out.println("Não há combustível o suficiente!!!");
				System.out.println();
			} else if (capacidadeAtualDoTanqueDeDiesel == 0.0) {
				System.out.println("Tanque Vazio!!!");
				System.out.println();
			} else {
				this.valorDeAbatecimentoEtanol += quantidadeDeCombustivelAbastecido;
				capacidadeAtualDoTanqueDeDiesel -= quantidadeDeLitrosSubtraidosDoTanque;
				System.out.println("Abastecimento feito com sucesso! Foram abastecidos: "
						+ Math.round(quantidadeDeLitrosSubtraidosDoTanque) + " litros.");
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

	double getValorArrecadadoTanqueDeEtanol() {
		return valorArrecadadoCompraDeEtanol;
	}

	void setValorArrecadadoTanqueDeEtanol(double valorArrecadadoTanqueDeEtanol) {
		this.valorArrecadadoCompraDeEtanol = valorArrecadadoTanqueDeEtanol;
	}

	double getValorArrecadadoTanqueDeGasolinaComum() {
		return valorArrecadadoCompraDeGasolinaComum;
	}

	void setValorArrecadadoTanqueDeGasolinaComum(double valorArrecadadoTanqueDeGasolinaComum) {
		this.valorArrecadadoCompraDeGasolinaComum = valorArrecadadoTanqueDeGasolinaComum;
	}

	double getValorArrecadadoTanqueDeGasolinaAditivada() {
		return valorArrecadadoCompraDeGasolinaAditivada;
	}

	void setValorArrecadadoTanqueDeGasolinaAditivada(double valorArrecadadoTanqueDeGasolinaAditivada) {
		this.valorArrecadadoCompraDeGasolinaAditivada = valorArrecadadoTanqueDeGasolinaAditivada;
	}

	double getValorArrecadadoTanqueDeDiesel() {
		return valorArrecadadoCompraDeDiesel;
	}

	void setValorArrecadadoTanqueDeDiesel(double valorArrecadadoTanqueDeDiesel) {
		this.valorArrecadadoCompraDeDiesel = valorArrecadadoTanqueDeDiesel;
	}

	double getValorArrecadadoCompraDeEtanol() {
		return valorArrecadadoCompraDeEtanol;
	}

	void setValorArrecadadoCompraDeEtanol(double valorArrecadadoCompraDeEtanol) {
		this.valorArrecadadoCompraDeEtanol = valorArrecadadoCompraDeEtanol;
	}

	double getValorArrecadadoCompraDeGasolinaComum() {
		return valorArrecadadoCompraDeGasolinaComum;
	}

	void setValorArrecadadoCompraDeGasolinaComum(double valorArrecadadoCompraDeGasolinaComum) {
		this.valorArrecadadoCompraDeGasolinaComum = valorArrecadadoCompraDeGasolinaComum;
	}

	double getValorArrecadadoCompraDeGasolinaAditivada() {
		return valorArrecadadoCompraDeGasolinaAditivada;
	}

	void setValorArrecadadoCompraDeGasolinaAditivada(double valorArrecadadoCompraDeGasolinaAditivada) {
		this.valorArrecadadoCompraDeGasolinaAditivada = valorArrecadadoCompraDeGasolinaAditivada;
	}

	double getValorArrecadadoCompraDeDiesel() {
		return valorArrecadadoCompraDeDiesel;
	}

	void setValorArrecadadoCompraDeDiesel(double valorArrecadadoCompraDeDiesel) {
		this.valorArrecadadoCompraDeDiesel = valorArrecadadoCompraDeDiesel;
	}

	double getValorDeAbatecimentoEtanol() {
		return valorDeAbatecimentoEtanol;
	}

	void setValorDeAbatecimentoEtanol(double valorDeAbatecimentoEtanol) {
		this.valorDeAbatecimentoEtanol = valorDeAbatecimentoEtanol;
	}

	double getValorDeAbatecimentoGasolinaComum() {
		return valorDeAbatecimentoGasolinaComum;
	}

	void setValorDeAbatecimentoGasolinaComum(double valorDeAbatecimentoGasolinaComum) {
		this.valorDeAbatecimentoGasolinaComum = valorDeAbatecimentoGasolinaComum;
	}

	double getValorDeAbatecimentoGasolinaAditivada() {
		return valorDeAbatecimentoGasolinaAditivada;
	}

	void setValorDeAbatecimentoGasolinaAditivada(double valorDeAbatecimentoGasolinaAditivada) {
		this.valorDeAbatecimentoGasolinaAditivada = valorDeAbatecimentoGasolinaAditivada;
	}

	double getValorDeAbatecimentoDiesel() {
		return valorDeAbatecimentoDiesel;
	}

	void setValorDeAbatecimentoDiesel(double valorDeAbatecimentoDiesel) {
		this.valorDeAbatecimentoDiesel = valorDeAbatecimentoDiesel;
	}

}