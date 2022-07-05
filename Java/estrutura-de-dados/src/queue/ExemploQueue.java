package queue;

import carro.Carro;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("ford"));
        queueCarros.add(new Carro("chev"));
        queueCarros.add(new Carro("fiat"));

        System.out.println(queueCarros.add(new Carro("peg")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("honda")));

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros);



    }
}
