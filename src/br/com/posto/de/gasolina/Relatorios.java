package br.com.posto.de.gasolina;

public class Relatorios {
	private TanquesDeCombustivel tanques = new TanquesDeCombustivel();

	public void exibirQuantidadeAtualDeCombustivelNoTanque() {
		String[] tipoDeCombustivel = new String[] { "Etanol", "Gasolina Comum", "Gasolina Aditivada", "Diesel" };
		Double[] arrayDeCapacidadeDosTanques = { tanques.getCapacidadeAtualDoTanqueDeEtanol(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaComum(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaAditivada(), tanques.getCapacidadeAtualDoTanqueDeDiesel() };
		for (int i = 0; i < arrayDeCapacidadeDosTanques.length; i++) {
			System.out.println(
					"Capacidade atual de " + tipoDeCombustivel[i] + " é de: " + arrayDeCapacidadeDosTanques[i]);
		}
	}

	public void exibirValorArrecadadoDeCombustivel() {
		System.out.println("Relatório de combustíveis comprados");
		System.out.println();

		}
	}

