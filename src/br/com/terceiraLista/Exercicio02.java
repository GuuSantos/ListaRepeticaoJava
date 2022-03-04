package br.com.terceiraLista;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero,cont1 = 0, cont2 = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Informe um número --> ");
			numero = teclado.nextInt();
			
			if(numero % 2 == 0) {
				cont1++;
			}else {
				cont2++;
			}
		}
		System.out.println("Você digitou "+cont1+" numero pares");
		
		System.out.println("Você digitou "+cont2+" numero ímpares");

	}

}
