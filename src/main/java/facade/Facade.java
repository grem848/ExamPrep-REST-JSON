package facade;


import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class Facade
{

    EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    private EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public List<Person> getAllPersons(int amount)
    {
        EntityManager em = getEntityManager();

        List<Person> persons = null;
        try
        {
            em.getTransaction().begin();
            TypedQuery<Person> qt = em.createQuery("select p from Person p", Person.class);
            persons = qt.setMaxResults(amount).getResultList();

            em.getTransaction().commit();
            return persons;
        } finally
        {
            em.close();
        }
    }


}
