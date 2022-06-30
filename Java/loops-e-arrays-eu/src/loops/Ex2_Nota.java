package loops;

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nota = 11;
		boolean valorErradoNota = true;

		while (valorErradoNota) {

			System.out.println("Entre com um n�mero de 0 a 10: ");
			nota = scan.nextInt();

			if (nota >= 0 && nota < 10) {
				valorErradoNota = false;
			} else {
				System.out.println("O n�mero que voc� digitou foi " + nota + ". Este n�mero n�o est� entre 0 e 10.");
			}

		}
		System.out.println("O n�mero digitado foi " + nota + ". Obrigado, at� mais!");
	}
}