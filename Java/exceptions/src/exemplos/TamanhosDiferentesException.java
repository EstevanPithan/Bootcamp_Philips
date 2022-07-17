package exemplos;

public class TamanhosDiferentesException extends ArrayIndexOutOfBoundsException{
    private int numerador;
    private int denominador;

    public TamanhosDiferentesException(String s, int numerador, int denominador) {
        super(s);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
