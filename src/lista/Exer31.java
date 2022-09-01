package lista;

import java.util.Scanner;
//validação de data, 22/22/2222, verificar ano bissexto
public class Exer31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma data no formato dd/mm/aaaa");
		String data = entrada.nextLine();

		String dia = data.substring(0, 2);
		String mes = data.substring(3, 5);
		String ano = data.substring(6, 10);

		int diaInt = Integer.parseInt(dia);
		int mesInt = Integer.parseInt(mes);
		int anoInt = Integer.parseInt(ano);

		if (diaInt > 31 || diaInt < 1) {
			System.out.println("Dia inválido");
		} else if (mesInt > 12 || mesInt < 1) {
			System.out.println("Mês inválido");
		} else if (anoInt < 1) {
			System.out.println("Ano inválido");
		} else if (mesInt == 2 && diaInt > 29) {
			System.out.println("Dia inválido");
		} else if (mesInt == 2 && diaInt == 29 && anoInt % 4 != 0 && anoInt % 100 != 0 && anoInt % 400 != 0) {s
			System.out.println("Dia inválido");
		} else {
			System.out.println("Data válida");
		}

		entrada.close();

	}

}
