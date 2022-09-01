package lista;

import java.util.Scanner;
//calcular media de alunos por turma, pedindo o numero de turmas e alunos, não pode ter mais que 40 alunos por turma
public class Exer23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int turmas, alunos, soma = 0, media = 0;

		System.out.println("Digite o numero de turmas: ");
		turmas = entrada.nextInt();

		for (int i = 1; i <= turmas; i++) {
			System.out.println("Digite o numero de alunos da turma " + i + ": ");
			alunos = entrada.nextInt();

			while (alunos > 40) {
				System.out.println("Numero de alunos invalido, digite novamente: ");
				alunos = entrada.nextInt();
			}

			soma += alunos;
		}

		media = soma / turmas;

		System.out.println("A media de alunos por turma é: " + media);

		entrada.close();

	}

}
