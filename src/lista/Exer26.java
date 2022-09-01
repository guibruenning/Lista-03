package lista;

import java.util.Scanner;
//mostrar tabela de 1 a 50pães, com o valor informado pelo usuário
public class Exer26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor do pão: ");
		float valor = Float.parseFloat(entrada.nextLine());

		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + String.format("%.2f", (i * valor)));
		}

		entrada.close();
	}

}
