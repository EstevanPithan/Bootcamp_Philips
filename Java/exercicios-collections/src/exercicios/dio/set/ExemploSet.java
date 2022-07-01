package exercicios.dio.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6, 5d)); // caso tenha itens iguais o hasshset vai ignorar

        System.out.println(notas); // Com o set os itens ficam organizados de forma aleatória

        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d)); //ele retorna true caso o contains ache o valor

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // por ser uma colletions ele aceita essa metodo

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Double soma = 0d;

//        Iterator<Double> iterator = notas.iterator();
//        while (iterator.hasNext()) {
//            Double next = iterator.next();
//            soma += next;
//        }

        for (Double nota : notas) {
            soma += nota;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Imprima a mádia das notas: " + soma / notas.size());

        notas.remove(0d);
        System.out.println("Remova a nota zero: " + notas);

        notas.removeIf(nota -> (nota < 7)); // não precisa de um loop para remover os itens

//        Iterator<Double> iterator = notas.iterator();
//        while (iterator.hasNext()) {
//            Double next = iterator.next();
//            System.out.println(next);
//            if (next < 7d){
//                iterator.remove();
//            }
//        }

        System.out.println("Remova as notas menores do que 7: " + notas);

        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6, 5d));
        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2); // o Treeset já ordena automaticamento a lista
        System.out.println(notas3);

        notas.clear();
        System.out.println("Apague todo o conjunto: " + notas.isEmpty());
    }
}
