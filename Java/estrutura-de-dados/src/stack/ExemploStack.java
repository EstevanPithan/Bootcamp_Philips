package stack;

import carro.Carro;

import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<Carro>();

        stackCarros.push(new Carro("ford"));
        stackCarros.push(new Carro("fiat"));
        stackCarros.push(new Carro("honda"));
        stackCarros.push(new Carro("volks"));
        stackCarros.push(new Carro("chev"));
        stackCarros.push(new Carro("hyundai"));


        System.out.println(stackCarros);
        System.out.println("Retire o ultimo carro da minha pilha: " + stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println("Qual o ultimo carro da minha pilha: " + stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println("Minha pilah está vazia: " + stackCarros.empty());
        System.out.println(stackCarros);

        System.out.println(stackCarros.get(2));


    }
}
