package lista;

import java.util.Scanner;

//Determinar o menor e o maior valor de um conjunto de n numeros

public class Exer16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de n: ");
		int n = entrada.nextInt();

		int i = 1;
		int maior = 0;
		int menor = 0;

		while(i <= n) {
			System.out.print("Digite o "+i+"º numero: ");
			int num = entrada.nextInt();

			if(i == 1) {
				maior = num;
				menor = num;
			}
			else {
				if(num > maior)
					maior = num;
				if(num < menor)
					menor = num;
			}

			i++;
		}

		System.out.println("Maior = "+maior);
		System.out.println("Menor = "+menor);


	}

}
