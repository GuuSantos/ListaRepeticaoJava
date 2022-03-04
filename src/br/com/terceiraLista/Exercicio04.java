package br.com.terceiraLista;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade, temperamento, contadorCalmas = 0, mulheresNervosas = 0, homensAgress = 0;
		int outrosCalmos = 0, nervosas40 = 0, calmas18 = 0, contador = 0;
		String sexo;
		
		while(contador != 3) {
			contador++;
			System.out.print("Informe a sua idade --> ");
			idade = teclado.nextInt();
			
			System.out.print("Homem, Mulher ou Outros --> ");
			sexo = teclado.next();
			
			System.out.print("Informe o seu temperamento (em escala númerica - 1, 2 e 3) --> ");
			temperamento = teclado.nextInt();
			
			if(temperamento == 1) {
				contadorCalmas++;
				
			}else if(sexo.equalsIgnoreCase("Mulher") && temperamento == 2) {
				mulheresNervosas++;
			}else if(sexo.equalsIgnoreCase("Homem") && temperamento == 3) {
				homensAgress++;
			}else if(sexo.equalsIgnoreCase("Outros")) {
				outrosCalmos++;
			}else if(idade > 40 && temperamento == 2) {
				nervosas40++;
			}else if(idade < 18 && temperamento == 1){
				calmas18++;
			}
			
		}
		contadorCalmas += calmas18;
		
		System.out.println("O número de pessoas calmas --> "+contadorCalmas);
		
		System.out.println("O número de mulheres nervosas --> "+mulheresNervosas);
		
		System.out.println("O número de homens agressivos --> "+homensAgress);
		
		System.out.println("O número de 'outros' calmos --> "+outrosCalmos);
		
		System.out.println("O número de pessoas nervosas com mais de 40 anos --> "+nervosas40);
		
		System.out.println("O número de pessoas calmas com menos de 18 anos --> "+calmas18);
		
	}

}
