package lista;

import java.util.Scanner;

//quantidade de numeros pares e impares em 10 numeros
public class Exer11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int pares = 0;
		int impares = 0;
		int num = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o numero: ");
			num = entrada.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}


	}

}
