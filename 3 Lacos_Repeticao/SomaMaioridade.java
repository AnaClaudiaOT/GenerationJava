package dRepetição;

import java.util.Scanner;

public class Ex3 {
	public static void main (String args[])
	{
		int idade,menor=0,maior=0;
		
		Scanner leitura = new Scanner (System.in);
		System.out.printf("Informe a idade: ");
		idade = leitura.nextInt();
		
		while (idade!=-99)
		{
			if (idade<=21) 
			{
				menor++;
			}
		if (idade>50)
		{
			maior++;
		}
		System.out.printf("Informe a idade: ");
		idade = leitura.nextInt();
		}
		
		System.out.printf("\nTotal de pessoas maior de idade %d",maior);
		System.out.printf("\nTotal de pessoas menor de idade %d",menor);
		
	}

}
