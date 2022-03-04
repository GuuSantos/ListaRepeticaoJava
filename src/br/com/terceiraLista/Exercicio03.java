package br.com.terceiraLista;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0, vinteUm = 0, mais50 = 0;
		
		while(idade != -99) {
			System.out.print("Informe a sua idade --> ");
			idade = teclado.nextInt();
			
			if(idade < 21) {
				if(idade == -99) {
					vinteUm--;
				}
				vinteUm++;
			}else if(idade > 50) {
				mais50++;
			}
	
		}
		System.out.println("O total de pessoas com menos de 21 anos é --> "+vinteUm);
		System.out.println("\nO total de pessoas com mais de 50 anos é --> "+mais50);
		
		
	}

}
