package dRepetição;

public class Ex1 {
	public static void main (String args[])
	{
		int x;	
		for(x=1000;x<=1999;x++)
		{		
		if(x%11==5)
		{
			System.out.println("O número " + x + " dividido por 11 tem o resto 5");
		}
		}
	}
} 
