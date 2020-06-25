package br.edu.univas;

import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pc = 0; 
		int pr = 0;
		int x = 0;
		int y = 0;
		int sul = 0;
		int sudeste = 0;
		int centroeste = 0;
		int norte = 0; 
		int nordeste = 0;
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			
			pc = sc.nextInt();
			
			System.out.println("Qual região do Brasil você mora?");
			
			pr = sc.nextInt();
			
			if (pr == 1) {
				
				x++;
				
			}else if (pc == 2) {
				
				y++;
				
			}
			
			if (pr == 1) {
				
				sul++;
				
			}else if (pr == 2) {
				
				sudeste++;
				
			}else if (pr == 3) {
				
				centroeste++;
				
			}else if (pr == 4) {
				
				norte++;
				
			}else if (pr == 5) {
				
				nordeste++;
				
			}
				
			
		}
		
		System.out.println("Pessoas que votaram sim = "+ x);
		System.out.println("Pessoas que votaram não = "+ y);
		System.out.println("Pessoas do Sul do Brasil = "+ sul);
		System.out.println("Pessoas do Sudeste do Brasil = "+ sudeste);
		System.out.println("Pessoas do Centroeste do Brasil = "+ centroeste);
		System.out.println("Pessoas do Norte do Brasil = "+ norte);
		System.out.println("Pessoas do Nordeste do Brasil = "+ nordeste);
		
		
		sc.close();
		
	}

}
