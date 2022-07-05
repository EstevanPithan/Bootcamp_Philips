package equalshashcode;

import carro.Carro;

import java.util.ArrayList;
import java.util.List;

public class ExemploEqualsHashCode {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("volks"));
        listaCarros.add(new Carro("chev"));
        listaCarros.add(new Carro("ford"));

        System.out.println(listaCarros.contains(new Carro("ford")));
        System.out.println((new Carro("ford").hashCode()));
        System.out.println((new Carro("ford1").hashCode()));

        Carro carro1 = new Carro("ford");
        Carro carro2 = new Carro("chev");

        System.out.println(carro1.equals(carro2));
    }
}
