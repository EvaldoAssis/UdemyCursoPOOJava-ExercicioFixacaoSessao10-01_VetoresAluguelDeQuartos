package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Aluguel;

/* Explicação do que foi feito no programa:
 * Criação do vetor de 10 posições com nome vect do tipo aluguel (Vetor do tipo classe) e;
 * Criação de uma variavel do tipo inteiro para receber o número de quartos a serem alugados;
 * Criação de um laço for que tem por condição rodar enquanto i for menor n;
 * Criação de uma variável de nome quarto do tipo inteiro, a fim de receber o número do quarto que o estudante deseja;
 * É feita uma instanciação com o vetor vect onde guardará a posição certa informada pelo usuário e atribuida na variavel quarto, também é chamado o construtor com os 2 atributos da classe Aluguel; */

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			
			System.out.print("Nome: ");
			sc.nextLine();
			
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}