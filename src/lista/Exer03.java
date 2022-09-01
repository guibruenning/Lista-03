package lista;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu Nome");
		String nome = entrada.nextLine();

		System.out.println("Digite sua idade");
		int idade = Integer.parseInt(entrada.nextLine());

		System.out.println("Digite seu sexo(f, m)");
		String sexo = entrada.nextLine();

		System.out.println("Digite seu salário");
		double salario = Double.parseDouble(entrada.nextLine());

		System.out.println("Estado Civil(s, c, v, d)");
		String estadoCivil = entrada.nextLine();

		if (nome.length() > 3)
			System.out.println("nome Valido");
		else
			System.out.println("nome Invalido");

		if(idade > 0 && idade< 150)
			System.out.println("idade Valida");
		else
			System.out.println("idade Invalida");

		if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))
			System.out.println("sexo Valido");
		else
			System.out.println("sexo Invalido");

		if(salario > 0)
			System.out.println("salario Valido");
		else
			System.out.println("salario Invalido");

		if (estadoCivil .equalsIgnoreCase("s") || estadoCivil .equalsIgnoreCase("c") || estadoCivil .equalsIgnoreCase("v") || estadoCivil .equalsIgnoreCase("d"))
			System.out.println("estado civil Valido");
		else
			System.out.println("estado civil Invalido");
	}

}
