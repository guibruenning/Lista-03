package lista;

import java.util.Scanner;
//n termos da da seria n/m
public class Exer14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int m = -1;

		System.out.print("Digite quantos termos vai executar: ");
		int termo = entrada.nextInt();


		for (int i = 1; i <= termo; i++) {
			m += 2;
			System.out.print(i + "/" + m + " | ");
		}

	}

}
