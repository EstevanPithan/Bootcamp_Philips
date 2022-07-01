package exercicios.dio.set;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ExecicioSet1 {
    public static void main(String[] args) {

        Set<String> coresArcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        System.out.println("Exiba todas as cores uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("\nQuantidade de cores no arco iris: " + coresArcoIris.size());

        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println("\nExiba as cores em ordem alfabética: " + coresArcoIris2);

        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        List<String> coresArcoIris4 = new ArrayList<>(coresArcoIris3);


        Collections.reverse(coresArcoIris4);
        System.out.println("\nImprima a lista de forma ao contrario: " + coresArcoIris4);



        System.out.println("\nMostre todas as cores que começam com a letra V: ");

        coresArcoIris4.removeIf(cor -> cor.charAt(0) != 'V');
        System.out.println(coresArcoIris4);
    }
}
