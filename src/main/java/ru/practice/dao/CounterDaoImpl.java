package ru.practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.practice.model.Counter;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * {@inheritDoc}
 */
@Repository
public class CounterDaoImpl implements CounterDao {

    private final EntityManager em;

    @Autowired
    public CounterDaoImpl(EntityManager em) {
        this.em = em;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Counter list() {
        TypedQuery<Counter> query = em.createQuery("SELECT h FROM Counter h", Counter.class);
        return query.getSingleResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int increment(int num) {
        Query query = em.createNativeQuery("UPDATE counter SET number =number +  ? where id =1");
        query.setParameter(1, num);
        return query.executeUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int decrement(int num) {
        Query query = em.createNativeQuery("UPDATE counter SET number =number -  ? where id =1");
        query.setParameter(1, num);
        return query.executeUpdate();
    }
}
