package Revisão;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco, conta;
        int menu;

        System.out.printf("Informe o valor do produto: R$ ");;
        preco = sc.nextDouble();

        System.out.printf("Qual será a forma de pagamento? \n1- A vista em dinheiro/cheque \n2- A vista no"
                + " cartão de credito\n3- Em duas vezes sem juros\n4- Em tres vezes\nInforme a condição: ");
        menu = sc.nextInt();

        switch(menu) {

        case 1:

            conta = preco * 0.20;
            conta = preco - conta;
            System.out.println("Valor a ser pago com 20% de desconto: R$ "+ conta);
            break;
        case 2:
            conta = preco * 0.15;
            conta = preco - conta;
            System.out.println("Valor a ser pago com 15% de desconto: R$ " + conta);
            break;
        case 3:
            System.out.println("Valor a ser pago: R$ " + (preco/2) + " reais Duas vezes.");
            break;
        case 4:
            conta = preco * 0.10;
            conta = preco + conta;
            System.out.println("Valor a ser pago: R$ "+ (Math.round(conta/3))+" reais Tres vezes. ");
            break;
        default:
            System.out.println("Opção Invalida");
            break;
        }
    }
}
