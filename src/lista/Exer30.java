package lista;

import java.util.Scanner;
//academia censo, mais alto, mais baixo, mais gordo, mais magro, media das alturas, pesos dos clientes, finalizar quando digitar 0
public class Exer30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int altura, peso, maisAlto = 0, maisBaixo = 0, maisGordo = 0, maisMagro = 0, somaAltura = 0, somaPeso = 0, cont = 0;
		int resp;

		do{
			System.out.println("Informe a altura: ");
			altura = entrada.nextInt();

			System.out.println("Informe o peso: ");
			peso = entrada.nextInt();

			if(altura > maisAlto){
				maisAlto = altura;
			}
			if(altura < maisBaixo){
				maisBaixo = altura;
			}
			if(peso > maisGordo){
				maisGordo = peso;
			}
			if(peso < maisMagro){
				maisMagro = peso;
			}
			somaAltura += altura;
			somaPeso += peso;
			cont++;

			System.out.println("Deseja continuar? (1/0)");
			resp = entrada.nextInt();

		}while(resp != 0);

		int mediaAltura = somaAltura / cont;
		int mediaPeso = somaPeso / cont;

		System.out.println("A maior altura é: " + maisAlto);
		System.out.println("A menor altura é: " + maisBaixo);
		System.out.println("A maior peso é: " + maisGordo);
		System.out.println("A menor peso é: " + maisMagro);
		System.out.println("A media das alturas é: " + mediaAltura);
		System.out.println("A media dos pesos é: " + mediaPeso);

		entrada.close();


	}

}
