package exercicios.dio.set;

import java.util.Date;

public class ExercicioSet2 {
    public static void main(String[] args) {

    }
}

class LinguagemFavorita {
    private String nome;
    private Integer ano;
    private String ide;

    public LinguagemFavorita(String nome, Integer ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }
}