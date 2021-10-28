package br.com.posto.de.gasolina;

public class Vendas {
	private Combustiveis etanol = new Combustiveis("Etanol", 2.39);
	private Combustiveis gasolinaComum = new Combustiveis("Gasolina Comum", 3.49);
	private Combustiveis gasolinaAditivada = new Combustiveis("Gasolina Aditivada", 3.69);
	private Combustiveis diesel = new Combustiveis("Diesel", 2.89);
	
	private ServicosAdicionais duchaEcologica = new ServicosAdicionais("Ducha Ecológica", 8.00);
	private ServicosAdicionais trocaDeOleo = new ServicosAdicionais("Troca de Óleo", 50.00);
	private ServicosAdicionais balanceamento = new ServicosAdicionais("Balanceamento", 35.00);
	private ServicosAdicionais cafe = new ServicosAdicionais("Café", 2.00);
	
}
