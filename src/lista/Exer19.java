package lista;

import java.util.Scanner;
//numeros primos entre 1 e n e quantas divisoes foram feitas
public class Exer19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n, i, j, cont = 0, cont2 = 0;

		System.out.print("Digite um numero: ");
		n = entrada.nextInt();

		for(i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				if(i % j == 0) {
					cont++;
				}
			}
			if(cont == 2) {
				System.out.print(i+" | ");
				cont2++;
			}
			cont = 0;
		}

		System.out.println("\nForam feitas " + cont2 + " divisoes");

		entrada.close();
	}

}
