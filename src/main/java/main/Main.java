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
        
        
        Person p1 = new Person("Mike", "Samson", 4321);

        em.persist(p1);
        
        Person p2 = new Person("Lars", "Samson", 43212);
        em.persist(p2);
        
        em.getTransaction().commit();
        em.close();
    }

}
