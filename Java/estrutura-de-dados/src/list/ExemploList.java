package list;

import carro.Carro;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("ford"));
        listCarros.add(new Carro("volks"));
        listCarros.add(new Carro("chev"));
        listCarros.add(new Carro("fiat"));

        System.out.println(listCarros);
        System.out.println(listCarros.contains(new Carro("ford")));



    }
}
