package view;

import java.util.Scanner;

import controller.ControllerBinario;

public class Principal {

	public static void main(String[] args) {
		ControllerBinario contBin = new ControllerBinario();
		Scanner sc = new Scanner(System.in);
		int numero = 2001;
		
		while(numero > 2000 || numero < 0) {
			numero = sc.nextInt();
		}
		
		String binario = contBin.converteBinario(numero);
		System.out.println("O número " + numero + " em binário fica: " + binario);
		sc.close();
	}

}
