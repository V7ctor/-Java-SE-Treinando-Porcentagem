package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class SegundaAplicacao {

	// Encontrar porcentagem de um valor
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.CANADA);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("O Aluno deve ter a taxa de aprovação maior ou igual à 50%");
		System.out.println();
		System.out.print("Determine uma nota máxima: ");
		Integer notaMaxima = sc.nextInt();
		
		System.out.print("Quantos acertos você Obteve: ");
		Integer acertos = sc.nextInt();
		
		Integer resultado = acertos * 100 / notaMaxima;
		
		Integer taxaErros = (resultado - 100) *-1;
		
		System.out.println("Sua nota foi de: " + acertos + " e sua Taxa de Acertos é de " + resultado + "%.");
		System.out.println("Taxa de Erros: " + taxaErros + "%.");
		System.out.println("Nota Máxima: " + notaMaxima);
		
		System.out.println();
		
		if (resultado >= 50) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}
