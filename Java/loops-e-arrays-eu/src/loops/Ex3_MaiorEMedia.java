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
			System.out.println("Digite o valor da " + (i + 1) + "º posição");
			array[i] = scan.nextDouble();

			if (array[i] > maiorNumero) {
				maiorNumero = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			mediaNumeros += array[i];
		}
		
		mediaNumeros /= array.length;
		
		System.out.println("Os número inseridos são: " + Arrays.toString(array) + ". O maior núemro é " + maiorNumero
				+ ", e a média é " + mediaNumeros);

	}
}
