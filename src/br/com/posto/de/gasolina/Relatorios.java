package br.com.posto.de.gasolina;

public class Relatorios {
	private Vendas vendas = new Vendas();
	private TanquesDeCombustivel tanques = new TanquesDeCombustivel();

	public void exibirQuantidadeAtualDeCombustivelNoTanque() {
		String[] tipoDeCombustivel = new String[] { "Etanol", "Gasolina Comum", "Gasolina Aditivada", "Diesel" };
		Double[] arrayDeCapacidadeDosTanques = { tanques.getCapacidadeAtualDoTanqueDeEtanol(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaComum(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaAditivada(), tanques.getCapacidadeAtualDoTanqueDeDiesel() };
		for (int i = 0; i < arrayDeCapacidadeDosTanques.length; i++) {
			System.out.println(
					"Capacidade atual de " + tipoDeCombustivel[i] + " � de: " + arrayDeCapacidadeDosTanques[i]);
		}
	}

	public void exibirValorArrecadadoDeCombustivel() {
		System.out.println("Relat�rio de combust�veis comprados");
		System.out.println();

		}
	}
