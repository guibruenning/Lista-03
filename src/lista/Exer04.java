package lista;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int continuar = 0;

		do {
			System.out.println("Digite a população menor na A e a maior na B\n");

			System.out.print("Digite a população do país A: ");
			int popA = Integer.parseInt(entrada.nextLine());

			System.out.print("Digite a taxa de crescimento do país A em %: ");
			double taxaA = Double.parseDouble(entrada.nextLine());

			int popB = 0;
			int count = 0;
			do {
				System.out.print("Digite a população do país B: ");
				popB = Integer.parseInt(entrada.nextLine());

			} while (popB < popA);

			double taxaB = 0;
			do {
				System.out.print("Digite a taxa de crescimento do país B %: ");
				taxaB = Double.parseDouble(entrada.nextLine());

			} while (taxaB > taxaA);

			int anos = 0;
			do {
				anos++;
				popA += (popA * taxaA) / 100;
				popB += (popB * taxaB) / 100;
			} while (popA <= popB);

			System.out.println("Levou " + anos + " anos para a população do país A ultrapassar a do país B");

			System.out.print("Deseja continuar?\n1 - Sim\n2 - Não\n: ");
			continuar = Integer.parseInt(entrada.nextLine());
		}while (continuar != 2);
	}

}
