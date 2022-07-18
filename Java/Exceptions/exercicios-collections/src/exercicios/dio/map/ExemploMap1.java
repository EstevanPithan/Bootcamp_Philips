package exercicios.dio.map;

import java.util.*;
import java.util.function.DoubleConsumer;

public class ExemploMap1 {
    public static void main(String[] args) {

        Map<String, Double> carrospopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println(carrospopulares);

        System.out.println("\nSubstitua o consumo do gol por 15,2: ");
        carrospopulares.put("Gol", 15.2);
        System.out.println(carrospopulares);

        System.out.println("\nVerifique se o modelo tucson está nos carros populares: " + carrospopulares.containsKey("Tucson"));

        System.out.println("\nExiba o consumo do Uno: " + carrospopulares.get("Uno"));

        System.out.println("\nExiba os modelos: " + carrospopulares.keySet());

        System.out.println("\nExiba o consumo dos carros: " + carrospopulares.values());

        Double maisEficiente = Collections.max(carrospopulares.values());

        System.out.println("\nMelhor eficiencia: " + maisEficiente);

        Set<Map.Entry<String, Double>> entries = carrospopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(maisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("\nModelo do carro mais eficiente: " + modeloMaisEficiente + " - " + maisEficiente);
            }// É interessante deixar a impressão dentro do if pois caso tenha dois carros com os cosumos iguais ambos serão impressos
        }

        Double menosEficiente = Collections.min(carrospopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(menosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("\nModelo do carro mais eficiente: " + modeloMenosEficiente + " - " + menosEficiente);
            } // É interessante deixar a impressão dentro do if pois caso tenha dois carros com os cosumos iguais ambos serão impressos
        }

        Iterator<Double> iterator = carrospopulares.values().iterator();
        Double soma = 0.0;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("\nExiba a soma dos consumos: " + soma);

        Double media = soma/carrospopulares.size();
        System.out.println("\nExiba a media dos consumos: " + media);


//        Iterator<Double> iterator1 = carrospopulares.values().iterator();
//        while (iterator1.hasNext()){
//            Double next = iterator1.next();
//            if (next.equals(15.6)){
//                iterator1.remove();
//            }
//        }

//        carrospopulares.values().removeIf(next -> next.equals(15.6));

        System.out.println("\nRemova os modelos de carro com o consumo igual a 15,6km/h: " + carrospopulares);


        Map<String, Double> carrospopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println("\nExiba todos os carros na ordem que foram inseridos" + carrospopulares1);


        Map<String, Double> carrospopulares2 = new TreeMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);

        }};
        System.out.println("\nExiba os carros ordenados por modelo: " + carrospopulares2);

        carrospopulares2.clear();
        System.out.println("\nApague o conjunto de carros: " + carrospopulares2.isEmpty());
    }
}
