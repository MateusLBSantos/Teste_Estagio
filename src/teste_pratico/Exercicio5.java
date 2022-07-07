package teste_pratico;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		String palavra;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		palavra = leitor.next();
		
		String invertida = "";		
		for(int i = palavra.length() -1; i >= 0; i--) {
			
		     invertida += palavra.charAt(i);
		     
		}
		
		System.out.println(invertida);
		
		
		
		
		leitor.close();

	}

}
