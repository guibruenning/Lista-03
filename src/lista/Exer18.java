package lista;

import java.util.Scanner;
//determinar se um número é primo ou não e imprimir por quais números ele é divisível
public class Exer18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, cont = 0;

		System.out.print("Digite um número: ");
		num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cont++;
				System.out.println("O número " + num + " é divisível por " + i);
			}
		}

		if (cont == 2) {
			System.out.println("O número " + num + " é primo");
		} else {
			System.out.println("O número " + num + " não é primo");
		}

		entrada.close();



	}

}
