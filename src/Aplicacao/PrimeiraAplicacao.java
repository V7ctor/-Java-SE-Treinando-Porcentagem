package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiraAplicacao {

	// Encontrar Porcentagem de um N�mero
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um valor: $");
		Double numero = sc.nextDouble();
		
		System.out.print("Entre com a porcentagem que voc� quer desse n�mero: ");
		Integer porcentagem = sc.nextInt();
		
		Double valor = (Double) numero * porcentagem / 100;
		
		System.out.println(porcentagem + "% de " + numero + " �: $" + String.format("%.2f", valor));
		
		sc.close();
	}

}
