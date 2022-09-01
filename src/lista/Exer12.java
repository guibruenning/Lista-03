package lista;

import java.util.Scanner;
//capas de gerar o n-esimo numero na sequencia de fibonacci
public class Exer12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o numero maximo da sequencia: ");
		int nMaximo = entrada.nextInt();

		int sequencia = 1;
		int sequenciaAnterior = 0;
		int contador = 0;
		while (contador < nMaximo) {
			System.out.print(sequencia + " | ");
			int aux = sequenciaAnterior;
			sequenciaAnterior = sequencia;
			sequencia = sequencia + aux;

			contador++;
		}



	}

}
