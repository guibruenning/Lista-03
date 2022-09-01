package lista;

import java.util.Scanner;
//fatorial de um número
public class Exer13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = entrada.nextInt();

		int fatorial = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}

		System.out.println("O fatorial de " + num + " é " + fatorial);

	}

}
