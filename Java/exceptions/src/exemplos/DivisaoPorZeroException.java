package exemplos;

public class DivisaoPorZeroException extends ArithmeticException{
    int denominador;

    public DivisaoPorZeroException(String message, int denominador) {
        super(message);
        this.denominador = denominador;
    }


}
