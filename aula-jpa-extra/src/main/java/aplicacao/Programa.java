package aplicacao;

import dominio.Pessoa;
import org.w3c.dom.ls.LSOutput;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Programa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Carlos", 123L);
        Pessoa p2 = new Pessoa(null, "Joana", 456L);
        Pessoa p3 = new Pessoa(null, "Ana", 789L);

//        isso é para ter uma conexão com o banco de dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AULA-JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println(em.createQuery("Select cpf from Pessoa where cpf like :cpf").setParameter("cpf", 123L).getResultList());


//        Pessoa p = em.getReference(Pessoa.class, 123);
//                find(Pessoa.class., 123);
//        em.getTransaction().begin();
//        em.getTransaction().commit();
//Caso não for uma simples leitura é necesário realizar uma transation
//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();
        System.out.println();
        System.out.println("Pronto!!!");
        em.close();
        emf.close();

    }


}
