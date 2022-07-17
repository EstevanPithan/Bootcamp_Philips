package exemplos;

import javax.swing.*;

public class Customizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 4, 8, 10, 8};
        int[] denominador = {2, 4, 2, 2, 0};


        try {
            if (denominador.length != numerador.length) {
                throw new TamanhosDiferentesException("Os vetores são de tamanho diferente", numerador.length, denominador.length);
            }
            for (int i = 0; i < denominador.length; i++) {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata!!", numerador[i], denominador[i]);
                } else if (denominador[i] == 0) {
                    throw new DivisaoPorZeroException("Divisão por zero", denominador[i]);
                }

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }
        } catch (DivisaoNaoExataException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (DivisaoPorZeroException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (TamanhosDiferentesException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println("O programa continua...");
    }


}


