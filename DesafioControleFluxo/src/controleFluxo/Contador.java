package controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		int numero2 = sc.nextInt();
		
		try {
			contar(numero1, numero2);
		}catch(ParametrosInvalidosException e) {
			System.out.println( e.getMessage());
		}
		sc.close();
	}
	
	static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
		
		if(numero1 > numero2) {
		throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro ");
		} else {
			
			int contagem = numero2 - numero1;
			for(int n = 0; n < contagem; n++ ) {
				System.out.println("Imprimindo o número " + (n + 1));
			}
		}
		
		
	}
	

}
