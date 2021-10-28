package br.com.posto.de.gasolina;

public class TanquesDeCombustivel {
	private final double CAPACIDADE_MAXIMA_TANQUES = 20000;
	private double capacidadeAtualDoTanqueDeEtanol;
	private double capacidadeAtualDoTanqueDeGasolinaComum;
	private double capacidadeAtualDoTanqueDeGasolinaAditivada;
	private double capacidadeAtualDoTanqueDeDiesel;
	private Combustiveis etanol = new Combustiveis(1.19);
	private Combustiveis gasolinaComum = new Combustiveis(2.19);
	private Combustiveis gasolinaAditivada = new Combustiveis(3.49);
	private Combustiveis diesel = new Combustiveis(2.89);
	private GerenciamentoDoPosto gerenciamento;

	public void armazenarOValorAbastecidoAoTanqueRespectivo(int opcaoEscolhida, double quantidadeDeCombustivelAbastecido) {
		opcaoEscolhida = gerenciamento.exibirEEscolherTipoDeCombustivel();
		quantidadeDeCombustivelAbastecido = gerenciamento.informarQuantidadeDeLitros();
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
}