package Condicional;

import java.util.Scanner;

public class Ex3 {
	
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.printf("Entre com sua idade: ");
		idade = entrada.nextInt();
		
		if (idade>=10 && idade<=14)
		{
			System.out.printf("A sua categoria é Infantil.");
		}
		else if (idade >=15 && idade <=17)
		{
			System.out.printf("A sua cateforia é Juvenil");
		}
		
		else if (idade>=18 && idade<=25)
		{
			System.out.printf("A sua categoria é Adulto");
		}
		else 
		{
			System.out.printf("Você não se enquadra em nenhuma categoria!");
		}
	}	
}
