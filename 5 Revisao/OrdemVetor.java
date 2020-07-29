package Revisão;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float [] vetor = new float[5];
        int codigo;

        for(int x = 0; x < 5; x++) {
            System.out.println("Informe o valor do vetor[" + (x+1)+ "]: ");
            vetor[x] = sc.nextFloat();
        }

        System.out.println("Informe a opção\n1- Vetor na ordem direta \n2- Vetor na ordem inversa");
        codigo = sc.nextInt();

        if (codigo == 1) {
            System.out.printf("Vetor: ");
            for(int i = 0; i < 5; i++) {
                System.out.printf(vetor[i] + "\t");
            }
        }else if(codigo == 2){
            System.out.printf("Vetor na ordem inversa: ");
            for (int i = 4; i >= 0 ; i--) {
                System.out.printf(vetor[i]+ "\t");
            }
        } else {
            System.out.println("Opção Invalida");
        }
    }



}
