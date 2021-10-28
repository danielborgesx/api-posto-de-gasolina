package br.com.posto.de.gasolina;

import java.util.Scanner;

public class GerenciamentoDoPosto {
	
	private Combustiveis combustiveis;
	private TanquesDeCombustivel tanques;
	private Vendas vendasEfetuadas;
	
	public void abastecerOsTanques() {
		tanques.armazenarOValorAbastecidoAoTanqueRespectivo(exibirEEscolherTipoDeCombustivel(), informarQuantidadeDeLitros());
	}
	
	public int exibirEEscolherTipoDeCombustivel() {
		Scanner scanner = new Scanner(System.in);
		String[] tipoDeCombustivel = new String[] {"Etanol", "Gasolina Comum", "Gasolina Aditivada", "Diesel"};
		for(int i = 0; i < tipoDeCombustivel.length; i++) {
			System.out.println("[" + i + "] " + tipoDeCombustivel[i]);
			}
		System.out.println();
		System.out.print("Escolha o tipo de combustível para abastecimento do tanque: ");
		int escolhaDoCombustivel = scanner.nextInt();
		return escolhaDoCombustivel;
		}
	
	public double informarQuantidadeDeLitros() {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Escolha a quantidade de combustível que deseja abastecer: ");
		double quantidadeDeLitros = scanner.nextDouble();
		return quantidadeDeLitros;
	}
	
}
