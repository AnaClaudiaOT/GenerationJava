package dRepetição;

import java.util.Scanner;

public class Ex5 {
	public static void main (String args[])
	{
		Scanner leitura = new Scanner (System.in);
		int num, somanum=0;
		do
		{
			System.out.printf("Entre com um número: ");
			num = leitura.nextInt();
			somanum = somanum + num;
		}
		while(num!=0);
		
		System.out.printf("A soma dos números digitados foi de: %d ",somanum);
				
	}

}
