package br.com.posto.de.gasolina;

public class Relatorios {

	public void exibirQuantidadeAtualDeCombustivelNoTanque(TanquesDeCombustivel tanques, Combustiveis[] combustiveis) {
		Double[] arrayDeCapacidadeDosTanques = { tanques.getCapacidadeAtualDoTanqueDeEtanol(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaComum(),
				tanques.getCapacidadeAtualDoTanqueDeGasolinaAditivada(), tanques.getCapacidadeAtualDoTanqueDeDiesel() };
		for (int i = 0; i < arrayDeCapacidadeDosTanques.length; i++) {
			System.out.println("Capacidade atual de " + combustiveis[i].getTipoDeCombustivel() + " é de: "
					+ arrayDeCapacidadeDosTanques[i]);
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
		double[] tanques = { tanque.getCapacidadeAtualDoTanqueDeEtanol(),
				tanque.getCapacidadeAtualDoTanqueDeGasolinaComum(),
				tanque.getCapacidadeAtualDoTanqueDeGasolinaAditivada(), tanque.getCapacidadeAtualDoTanqueDeDiesel() };
		double[] valorArrecadado = { tanque.getValorArrecadadoCompraDeEtanol(),
				tanque.getValorArrecadadoCompraDeGasolinaComum(), tanque.getValorArrecadadoCompraDeGasolinaAditivada(),
				tanque.getValorArrecadadoCompraDeDiesel() };
		for (int i = 0; i < combustiveis.length; i++) {
			System.out.println("O tanque de " + combustiveis[i].getTipoDeCombustivel() + " foi abastecido com "
					+ tanques[i] + " litros. O valor pago ao fornecedor é de " + valorArrecadado[i]);
		}
		System.out.println();
	}

	public void exibirRelatorioDeLucrosBrutosDosServicosAdicionais(ServicosAdicionais[] servicosAdicionais,
			Vendas vendas) {
		exibirRelatorioDeVendasDeServicosAdicionais(servicosAdicionais, vendas);
		double[] valorArrecadadoVendas = { vendas.getResultadoDaOperacaoDuchaEcologica(),
				vendas.getResultadoDaOperacaoTrocaDeOleo(), vendas.getResultadoDaOperacaoBalaceamento(),
				vendas.getResultadoDaOperacaoCafe() };
		double valorBrutoArrecadado = 0.0;
		for (int i = 0; i < valorArrecadadoVendas.length; i++) {
			valorBrutoArrecadado += valorArrecadadoVendas[i];
		}
		System.out.println("O valor bruto de servicos adicionais é de R$" + valorBrutoArrecadado);
	}
	
	public void exibirRelatorioDeLucrosBrutosDosCombustiveis(Combustiveis[] combustiveis, TanquesDeCombustivel tanques) {
		exibirRelatorioDeVendasDeCombustivel(combustiveis, tanques);
		double[] valorArrecadado = { tanques.getValorDeAbatecimentoEtanol(),
				tanques.getValorDeAbatecimentoGasolinaComum(), tanques.getValorDeAbatecimentoGasolinaAditivada(),
				tanques.getValorDeAbatecimentoDiesel() };
		double valorBrutoArrecadado = 0.0;
		for(int i = 0; i < valorArrecadado.length; i++) {
			valorBrutoArrecadado += valorArrecadado[i];
		}
		System.out.println("O valor bruto arrecadado de combustíveis é de R$" + valorBrutoArrecadado);
	}
	
	public void exibirRelatorioDeLucrosLiquidosDosCombustiveis(TanquesDeCombustivel tanques) {
		double[] valorArrecadadoPeloAbastecimento = { tanques.getValorDeAbatecimentoEtanol(),
				tanques.getValorDeAbatecimentoGasolinaComum(), tanques.getValorDeAbatecimentoGasolinaAditivada(),
				tanques.getValorDeAbatecimentoDiesel() };
		double[] valorGastoPelaCompraCombustivel = { tanques.getValorArrecadadoCompraDeEtanol(),
				tanques.getValorArrecadadoCompraDeGasolinaComum(), tanques.getValorArrecadadoCompraDeGasolinaAditivada(),
				tanques.getValorArrecadadoCompraDeDiesel() };
		double valorTotalArrecadadoPeloAbastecimento = 0.0;
		double valorTotalGastoPelaCompraCombustivel = 0.0;
		for (int i = 0; i < valorGastoPelaCompraCombustivel.length; i++) {
			valorTotalArrecadadoPeloAbastecimento += valorArrecadadoPeloAbastecimento[i];
			valorTotalGastoPelaCompraCombustivel += valorGastoPelaCompraCombustivel[i];
		}
		double valorLiquido = valorTotalArrecadadoPeloAbastecimento - valorTotalGastoPelaCompraCombustivel;
		System.out.println("O valor liquido arrecadado de combustíveis é de R$" + valorLiquido);
	}
	
	public void exibirRelatorioTotalDeLucrosBrutosELiquidos(TanquesDeCombustivel tanques, Vendas vendas) {
		double[] valorArrecadadoVendas = { vendas.getResultadoDaOperacaoDuchaEcologica(),
				vendas.getResultadoDaOperacaoTrocaDeOleo(), vendas.getResultadoDaOperacaoBalaceamento(),
				vendas.getResultadoDaOperacaoCafe() };
		double[] valorArrecadadoPeloAbastecimento = { tanques.getValorDeAbatecimentoEtanol(),
				tanques.getValorDeAbatecimentoGasolinaComum(), tanques.getValorDeAbatecimentoGasolinaAditivada(),
				tanques.getValorDeAbatecimentoDiesel() };
		double[] valorArrecadadoPelaCompraCombustivel = { tanques.getValorArrecadadoCompraDeEtanol(),
				tanques.getValorArrecadadoCompraDeGasolinaComum(), tanques.getValorArrecadadoCompraDeGasolinaAditivada(),
				tanques.getValorArrecadadoCompraDeDiesel() };
		double valorVendasArrecadado = 0.0;
		double valorTotalArrecadadoPeloAbastecimento = 0.0;
		double valorTotalArrecadadoPelaCompraCombustivel = 0.0;
		for(int i = 0; i < valorArrecadadoPelaCompraCombustivel.length; i++) {
			valorVendasArrecadado += valorArrecadadoVendas[i];
			valorTotalArrecadadoPeloAbastecimento += valorArrecadadoPeloAbastecimento[i];
			valorTotalArrecadadoPelaCompraCombustivel += valorArrecadadoPelaCompraCombustivel[i];
		}
		double valorTotalBruto = valorVendasArrecadado + valorTotalArrecadadoPeloAbastecimento;
		double valorTotalLiquido = valorTotalArrecadadoPelaCompraCombustivel - valorTotalArrecadadoPeloAbastecimento;
		System.out.println("O valor total bruto de combustíveis e serviços é de R$" + valorTotalBruto + ". O valor total liquido é de R$" + valorTotalLiquido);
	}
}
