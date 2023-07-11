package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Aluguel;

/* Explica��o do que foi feito no programa:
 * Cria��o do vetor de 10 posi��es com nome vect do tipo aluguel (Vetor do tipo classe) e;
 * Cria��o de uma variavel do tipo inteiro para receber o n�mero de quartos a serem alugados;
 * Cria��o de um la�o for que tem por condi��o rodar enquanto i for menor n;
 * Cria��o de uma vari�vel de nome quarto do tipo inteiro, a fim de receber o n�mero do quarto que o estudante deseja;
 * � feita uma instancia��o com o vetor vect onde guardar� a posi��o certa informada pelo usu�rio e atribuida na variavel quarto, tamb�m � chamado o construtor com os 2 atributos da classe Aluguel; */

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.println("Quantos quartos ser�o alugados? ");
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