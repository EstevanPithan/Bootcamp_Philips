package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] array = new double[5];
		double maiorNumero = -999;
		double mediaNumeros = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o valor da " + (i + 1) + "� posi��o");
			array[i] = scan.nextDouble();

			if (array[i] > maiorNumero) {
				maiorNumero = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			mediaNumeros += array[i];
		}
		
		mediaNumeros /= array.length;
		
		System.out.println("Os n�mero inseridos s�o: " + Arrays.toString(array) + ". O maior n�emro � " + maiorNumero
				+ ", e a m�dia � " + mediaNumeros);

	}
}
