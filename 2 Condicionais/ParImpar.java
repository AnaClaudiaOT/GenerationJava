package Condicional;

import java.util.Scanner;

public class Ex4 {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int num;
		double raiz,pot;
		System.out.printf("Entre com um valor: ");
		num = entrada.nextInt();
		
		if (num%2==0)
		{
			raiz = Math.sqrt(num);
			System.out.printf("Seu n�mero � par e sua raiz quadrada � de: %2.2f ",raiz);
		}
		else 
		{
			pot = Math.pow(num,2);
			System.out.printf("Seu n�mero � impar e seu valor elevado ao quadrado � de: %2.2f",pot);
		}
		
	}

}
