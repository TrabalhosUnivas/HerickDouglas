package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float numero;
		int cont = 0;
		
		do {
			System.out.println("Escreva os numeros");
			numero = sc.nextFloat();
			
			if  (numero > 0) {
				cont++;
			}
			
			if (numero == 0) {
				
				break;
				
			}
		
	} while (true);
		
		System.out.println("A total de numeros negativos digitados é: "+ cont);		
		
		sc.close();
     }

}
