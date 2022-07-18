package loops;

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nota = 11;
		boolean valorErradoNota = true;

		while (valorErradoNota) {

			System.out.println("Entre com um número de 0 a 10: ");
			nota = scan.nextInt();

			if (nota >= 0 && nota < 10) {
				valorErradoNota = false;
			} else {
				System.out.println("O número que você digitou foi " + nota + ". Este número não está entre 0 e 10.");
			}

		}
		System.out.println("O número digitado foi " + nota + ". Obrigado, até mais!");
	}
}