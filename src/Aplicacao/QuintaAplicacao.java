package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class QuintaAplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o Pre�o do Produto: $");
		Double precoProduto = sc.nextDouble();
		
		System.out.print("Qual valor voc� pagou: $");
		Double precoPago = sc.nextDouble();
		
		Double resultado = precoProduto * precoPago  / 100;
		
		System.out.println("Ent�o o Desconto foi de " + String.format("%.2f", resultado) + "%.");
		
		sc.close();
	}

}
