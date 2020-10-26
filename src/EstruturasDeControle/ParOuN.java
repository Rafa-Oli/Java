package EstruturasDeControle;

import java.util.Scanner;

public class ParOuN {
  
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int numero=entrada.nextInt();
		
		if(numero>0 && numero<10) {
			if(numero % 2 ==0) {
				
				System.out.println("é par");
			}
			
	}
		entrada.close();
  }
  
  
  
}
