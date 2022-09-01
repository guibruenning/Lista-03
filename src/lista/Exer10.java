package lista;

import java.util.Scanner;
//exponenciação de um numero por outro
public class Exer10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o numero: ");
		int num = entrada.nextInt();
		System.out.print("Digite o numero: ");
		int exp = entrada.nextInt();

		int resultado = 1;
		for (int i = 0; i < exp; i++) {
			resultado *= num;
			System.out.print(i+": " + resultado+" | ");
		}

		System.out.println("O resultado é: " + resultado);

	}

}
