package exemplos;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "É preciso inserir o numero válido: "+ e.getMessage());
                System.out.println("É preciso inserir o numero válido" + e.getMessage());
                //e.printStackTrace();
            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "O denominador não pode ser zero: "+ e.getMessage());
                System.out.println("O denominador não pode ser zero: " + e.getMessage());
            }

            finally {
                System.out.println("chegou no finally");
            }

        } while (continueLooping);
        System.out.println("Fim do programa =D");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
