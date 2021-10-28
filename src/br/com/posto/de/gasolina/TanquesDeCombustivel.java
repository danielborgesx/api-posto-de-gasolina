package br.com.posto.de.gasolina;

import java.util.Scanner;

public class TanquesDeCombustivel {
	private final double CAPACIDADE_MAXIMA_TANQUES = 20000;
	private double capacidadeAtualDoTanqueDeEtanol;
	private double capacidadeAtualDoTanqueDeGasolinaComum;
	private double capacidadeAtualDoTanqueDeGasolinaAditivada;
	private double capacidadeAtualDoTanqueDeDiesel;
	private Combustiveis etanol = new Combustiveis("Etanol", 1.19, 2.39);
	private Combustiveis gasolinaComum = new Combustiveis("Gasolina Comum", 2.19, 3.49);
	private Combustiveis gasolinaAditivada = new Combustiveis("Gasolina Aditivada", 2.29, 3.69);
	private Combustiveis diesel = new Combustiveis("Diesel", 1.39, 2.89);
	private Combustiveis[] combustiveis = { etanol, gasolinaComum, gasolinaAditivada, diesel };
	private Vendas vendas;

	public void armazenarOValorAbastecidoAoTanqueRespectivo() {
		int opcaoEscolhida = exibirEEscolherTipoDeCombustivelParaAbastecimentoDoTanque();
		double quantidadeDeCombustivelAbastecido = informarQuantidadeDeLitrosParaAbastecimentoDoTanque();
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

	public void subtrairOValorAbastecidoPeloClienteDaCapacidadeDoTanque(int opcaoEscolhida,
			double quantidadeDeCombustivelAbastecido) {
		double quantidadeDeLitrosSubtraidosDoTanque = 0.0;
		opcaoEscolhida = vendas.exibirEEscolherTipoDeCombustivelParaVenda();
		for (int i = 0; i < combustiveis.length; i++) {
			quantidadeDeLitrosSubtraidosDoTanque = vendas.exibirEInformarQuantidadeDeLitrosParaAbastecimentoDoCarroDoCliente()
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
					while (opcaoEscolhida >= 0 && opcaoEscolhida < 3) {
						System.out.println("Abastecimento feito com sucesso!");
					}
					{
					}
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

	double getCAPACIDADE_MAXIMA_TANQUES() {
		return CAPACIDADE_MAXIMA_TANQUES;
	}

}