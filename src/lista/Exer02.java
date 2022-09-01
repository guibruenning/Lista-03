package lista;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String senha = "";
		int count = 0;

		System.out.print("Digite seu login: ");
		String login = entrada.nextLine();

		do {
			if(count > 0)
				System.out.println("digite uma senha defirente do Login");
			else
				count++;

			System.out.print("Digite sua senha: ");
			senha = entrada.nextLine();
		}while(senha.equals(login));

		System.out.println("Login e senha Diferentes");

	}

}
