/*4. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro, converta para binário. Entrada limitada a 2000.
• O Código deve apresentar, em formato de comentário, como foi definida a condição de
parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;*/
package controller;

public class ControllerBinario {
	
	public ControllerBinario() {
		super();
	}
	
	public String converteBinario(int numero) {
		String binario = "";
		if(numero / 2 == 0) {
			binario += String.valueOf(numero % 2);
			return binario;//Quando o numero dividido por 2 for 0, a divisao chega ao final. Binario recebe o resto da divisao e retorna binario.
		} else {
			binario += String.valueOf(numero % 2);
			return converteBinario(numero / 2) + binario;//Senão, binario recebe o resto da divisao por 2 e retornamos a recursiva dividindo numero por 2 mais binario para garantir a leitura invertida.
		}
	}
}
