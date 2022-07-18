package exercicios.dio.list;

import java.util.*;

public class ExercicioUm {

    public static void main(String[] args) {
        List<TempMeses> primeiroSemestre = new ArrayList<>() {{
            add(new TempMeses("Janeiro", 38.0));
            add(new TempMeses("Fevereiro", 48.0));
            add(new TempMeses("Março", 20.0));
            add(new TempMeses("Abril", 30.0));
            add(new TempMeses("Maio", 15.0));
            add(new TempMeses("Junho", 5.0));

        }};

        Iterator<TempMeses> iterator = primeiroSemestre.iterator();
        Double soma = 0d;
        Double media;
        while (iterator.hasNext()) {
            Double next = iterator.next().getTemp();
            soma += next;
        }

        media = soma/ primeiroSemestre.size();
        System.out.println("Os meses com suas respectivas temperaturas são: " + primeiroSemestre);
        System.out.println("A média de temperatura no primeiro semestre foi de: " + media);

        List<TempMeses> mesesAcima = new ArrayList<>();


        for (TempMeses tempMeses : primeiroSemestre) {
            if (tempMeses.getTemp() > media) {
                mesesAcima.add(tempMeses);
            }
        }

//        for (int i=0; i< primeiroSemestre.size(); i++){
//            if (primeiroSemestre.get(i).getTemp() > media){
//                mesesAcima.add(primeiroSemestre.get(i));
//            }
//        }

//        Iterator<TempMeses> iterator1 = primeiroSemestre.iterator();

//        while (iterator1.hasNext()) {
//            List<TempMeses> aux = new ArrayList<>(){{
//                add(iterator1.next());
//            }};
//
//            if (aux.get(0).getTemp() > media){
//              mesesAcima.add(aux.get(0));
//            }
//
//        }
        System.out.println("Os meses com a temperatura acima da média são: " + mesesAcima);
    }
}

class TempMeses{
    private final String mes;
    private final Double temp;

    public TempMeses(String mes, Double temp) {
        this.mes = mes;

        this.temp = temp;
    }


    public Double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temp=" + temp +
                '}';
    }
}




