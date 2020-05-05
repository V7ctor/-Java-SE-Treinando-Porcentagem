package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class QuintaAplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o Preço do Produto: $");
		Double precoProduto = sc.nextDouble();
		
		System.out.print("Qual valor você pagou: $");
		Double precoPago = sc.nextDouble();
		
		Double resultado = precoProduto * precoPago  / 100;
		
		System.out.println("Então o Desconto foi de " + String.format("%.2f", resultado) + "%.");
		
		sc.close();
	}

}
