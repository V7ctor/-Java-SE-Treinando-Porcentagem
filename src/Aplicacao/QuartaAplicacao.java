package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class QuartaAplicacao {

	// Aplicação para descobrir o valor da porcentagem de uma oferta
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o Preço do Produto: $");
		Double preco = sc.nextDouble();
		
		System.out.print("Insira a Porcentagem da Oferta: ");
		Double porcentagem = sc.nextDouble();
		
		
		Double resultado = preco - (porcentagem * preco) / 100;
		
		Double valorDesconto = (resultado - preco) * -1;
		
		System.out.println("Preço à se Pagar: " + String.format("%.2f", resultado));
		System.out.println(porcentagem + "% de Desconto, Equivalente à $" + String.format("%.2f", valorDesconto));
		sc.close();
	}
}
