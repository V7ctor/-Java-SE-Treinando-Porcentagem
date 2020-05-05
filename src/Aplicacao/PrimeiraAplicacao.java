package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiraAplicacao {

	// Encontrar Porcentagem de um Número
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um valor: $");
		Double numero = sc.nextDouble();
		
		System.out.print("Entre com a porcentagem que você quer desse número: ");
		Integer porcentagem = sc.nextInt();
		
		Double valor = (Double) numero * porcentagem / 100;
		
		System.out.println(porcentagem + "% de " + numero + " é: $" + String.format("%.2f", valor));
		
		sc.close();
	}

}
