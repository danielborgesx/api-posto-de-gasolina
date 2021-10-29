package br.com.posto.de.gasolina;

public class Relatorios {

	public void exibirQuantidadeAtualDeCombustivelNoTanque(TanquesDeCombustivel tanques) {
		String[] tipoDeCombustivel = new String[] { "Etanol", "Gasolina Comum", "Gasolina Aditivada", "Diesel" };
		Double[] arrayDeCapacidadeDosTanques = { tanques.getCapacidadeAtualDoTanqueDeEtanol(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaComum(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaAditivada(), tanques.getCapacidadeAtualDoTanqueDeDiesel() };
		for (int i = 0; i < arrayDeCapacidadeDosTanques.length; i++) {
			System.out.println(
					"Capacidade atual de " + tipoDeCombustivel[i] + " é de: " + arrayDeCapacidadeDosTanques[i]);
		}
	}

	public void exibirRelatorioDeVendasDeCombustivel(Combustiveis[] combustiveis, TanquesDeCombustivel tanques) {
		System.out.println("Relatório de combustíveis vendidos");
		System.out.println();
		double[] valorArrecadado = { tanques.getValorDeAbatecimentoEtanol(),
				tanques.getValorDeAbatecimentoGasolinaComum(), tanques.getValorDeAbatecimentoGasolinaAditivada(),
				tanques.getValorDeAbatecimentoDiesel() };
		for (int i = 0; i < combustiveis.length; i++) {
			System.out.println("Combustivel " + combustiveis[i].getTipoDeCombustivel() + " abastecido com "
					+ Math.round(valorArrecadado[i] / combustiveis[i].getValorDeVendaDosCombustiveis())
					+ " litros. Foram arrecadados R$" + valorArrecadado[i] + " reais.");
		}
		System.out.println();
	}

	public void exibirRelatorioDeVendasDeServicosAdicionais(ServicosAdicionais[] servicosAdicionais, Vendas vendas) {
		int[] quantidadeDeOperacoe = { vendas.getQuantidadeDeOperacoesDuchaEcologica(),
				vendas.getQuantidadeDeOperacoesTrocaDeOleo(), vendas.getQuantidadeDeOperacoesBalanceamento(),
				vendas.getQuantidadeDeOperacoesCafe() };
		double[] valorArrecadadoVendas = { vendas.getResultadoDaOperacaoDuchaEcologica(),
				vendas.getResultadoDaOperacaoTrocaDeOleo(), vendas.getResultadoDaOperacaoBalaceamento(),
				vendas.getResultadoDaOperacaoCafe() };
		for (int i = 0; i < servicosAdicionais.length; i++) {
			double valorArrecadadoPelosServicos = valorArrecadadoVendas[i];
			String tipoDeProduto = servicosAdicionais[i].getNomeDoServico();
			System.out.println(quantidadeDeOperacoe[i] + " produto(s) " + tipoDeProduto
					+ " comprado(s). Valor arrecadado: " + valorArrecadadoPelosServicos);
		}
		System.out.println();
	}

	public void exibirRelatorioDeDespesasDeCombustivel(Combustiveis[] combustiveis, TanquesDeCombustivel tanque) {
		System.out.println("Relatório de combustíveis comprados");
		System.out.println();
		Double[] tanques = { tanque.getCapacidadeAtualDoTanqueDeEtanol(),
				tanque.getCapacidadeAtualDoTanqueDeGasolinaComum(),
				tanque.getCapacidadeAtualDoTanqueDeGasolinaAditivada(), tanque.getCapacidadeAtualDoTanqueDeDiesel() };
		Double[] valorArrecadado = { tanque.getValorArrecadadoTanqueDeEtanol(),
				tanque.getValorArrecadadoTanqueDeGasolinaComum(), tanque.getValorArrecadadoTanqueDeGasolinaAditivada(),
				tanque.getValorArrecadadoTanqueDeDiesel() };
		for (int i = 0; i < combustiveis.length; i++) {
			System.out.println("O tanque de " + combustiveis[i].getTipoDeCombustivel() + " foi abastecido com "
					+ tanques[i] + " litros. O valor pago ao fornecedor é de " + valorArrecadado[i]);
		}
		System.out.println();
	}

	public void exibirRelatorioDeLucrosBrutosDosServicosAdicionais(ServicosAdicionais[] servicosAdicionais,
			Vendas vendas) {
		exibirRelatorioDeVendasDeServicosAdicionais(servicosAdicionais, vendas);
		Double[] valorArrecadadoVendas = { vendas.getResultadoDaOperacaoDuchaEcologica(),
				vendas.getResultadoDaOperacaoTrocaDeOleo(), vendas.getResultadoDaOperacaoBalaceamento(),
				vendas.getResultadoDaOperacaoCafe() };
		double valorBrutoArrecadado = 0.0;
		for (int i = 0; i < valorArrecadadoVendas.length; i++) {
			valorBrutoArrecadado += valorArrecadadoVendas[i];
		}
		System.out.println("O valor bruto de servicos adicionais é de R$" + valorArrecadadoVendas);
	}
}
