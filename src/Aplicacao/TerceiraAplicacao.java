package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class TerceiraAplicacao {

	// Programa para verificar a taxa de torcedores dos times da liga
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas foram entrevistadas: ");
		Integer quantidadePessoas = sc.nextInt();
				
		System.out.print("Quantos desses s�o torcedores do Corinthians: ");
		Integer torcedoresCorinthians = sc.nextInt();
		
		System.out.print("Quantos desses s�o torcedores do S�o Paulo: ");
		Integer torcedoresSaoPaulo = sc.nextInt();
		
		Double taxaCorinthians =  (double) (torcedoresCorinthians * 100 / quantidadePessoas); 
		Double taxaSaoPaulo =  (double) (torcedoresSaoPaulo * 100 / quantidadePessoas); 
		
		System.out.println(String.format("%.2f", taxaCorinthians) + "% s�o Torcedores Corinthianos!");
		System.out.println(String.format("%.2f", taxaSaoPaulo) + "% s�o Torcedores S�o Paulinos!");
		sc.close();
	}
}
