package lista;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.print("Digite o valor do segundo número: ");
		int num2 = entrada.nextInt();

		int numAleatorio = (int) (Math.random() * (num2 - num1 + 1)) + num1;
		
		System.out.println("O número aleatório é: " + numAleatorio);
	}

}
