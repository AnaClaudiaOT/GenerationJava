package bExerciciosJava;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String args[]) {
		
		int anos, meses, dias, totaldias;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
        anos = leitura.nextInt();
        
        System.out.println("Digite sua idade em meses: ");
        meses = leitura.nextInt();

        System.out.println("Digite sua idade em dias: ");
        dias = leitura.nextInt();
        
        totaldias = anos*365+meses*30+dias;
        
        System.out.printf("Sua idade em dias é de: %d dias ...\n ", totaldias);
        System.out.println("Sua idade em dias é de: " + totaldias + " dias..");
        		
		
	}

}
