package lista;

import java.util.Scanner;
//taboada de multiplicar
public class Exer09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da taboada: ");
		int num1 = entrada.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num1 + " = " + (i * num1));
		}

	}

}
