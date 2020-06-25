import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Escreva um numero:");
		
		int x = sc.nextInt();
		
		if (x % 5 == 3) {
			x = x + 2;	
		}
		
		if (x % 5 == 4) {	
			x = x + 1;		
		}
		
		System.out.println(x);
		sc.close();
		
	}

}
