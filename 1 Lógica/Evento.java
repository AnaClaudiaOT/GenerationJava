package bExerciciosJava;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String args[]) {

        int segundos,horas,minutos,x;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tempo do evento em segundos:");
        x = leitura.nextInt();

        horas = x/3600;
        minutos = (x%3600) / 60;
        segundos = (x%3600) % 60;

        System.out.println("Horas:" + horas);
        System.out.println("Minutos:" + minutos);
        System.out.println("Segundos:" + segundos);

}
}