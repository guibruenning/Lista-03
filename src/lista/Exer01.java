package lista;

import java.util.Arrays;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		
		int count = 0;
		
		do {
			
			if(count>0)
				System.out.println("Digite uma nota entre 0 e 10");
			else 
				count ++;
						
			System.out.print("Digite uma nota: ");
			num = entrada.nextInt();
			
			if(num > 0 && num < 10)
				count = 0;
			
		}while(num < 0 || num > 10);

		System.out.println("Nota valida");
		entrada.close();
	}
	
}
