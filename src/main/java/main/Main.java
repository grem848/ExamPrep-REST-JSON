package main;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main
{

    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        
        Person p1 = new Person("Mike", "Samson", 43);
        em.persist(p1);
        Person p2 = new Person("Lars", "Samson", 20);
        em.persist(p2);
        Person p3 = new Person("Ib", "Hanson", 14);
        em.persist(p3);
        Person p4 = new Person("Bo", "Samson", 23);
        em.persist(p4);
        Person p5 = new Person("Kurt", "Samson", 40);
        em.persist(p5);
        Person p6 = new Person("Lars", "Smidt", 35);
        em.persist(p6);
        Person p7 = new Person("Mike", "Svensson", 23);
        em.persist(p7);
        Person p8 = new Person("Ole", "Samson", 29);
        em.persist(p8);
        Person p9 = new Person("Egon", "Knutsson", 53);
        em.persist(p9);
        Person p10 = new Person("Mark", "Knutsson", 26);
        em.persist(p10);
        Person p11 = new Person("Birte", "Knutsson", 32);
        em.persist(p11);
        Person p12 = new Person("Lars", "Knutsson", 30);
        em.persist(p12);
        Person p13 = new Person("Hanne", "Egozi", 14);
        em.persist(p13);
        Person p14 = new Person("Bo", "Samson", 23);
        em.persist(p14);
        Person p15 = new Person("Kurt", "Samson", 40);
        em.persist(p15);
        Person p16 = new Person("Birte", "Smidt", 35);
        em.persist(p16);
        Person p17 = new Person("Hanne", "Egozi", 23);
        em.persist(p17);
        Person p18 = new Person("Birte", "Egozi", 29);
        em.persist(p18);
        Person p19 = new Person("Svend", "Knutsson", 53);
        em.persist(p19);
        Person p20 = new Person("August", "Egozi", 26);
        em.persist(p20);
        
        em.getTransaction().commit();
        em.close();
    }

}
