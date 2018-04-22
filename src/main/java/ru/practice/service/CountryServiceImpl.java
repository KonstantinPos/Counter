package ru.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.practice.dao.CounterDao;
import ru.practice.model.Counter;

/**
 * {@inheritDoc}
 */
@Service
public class CountryServiceImpl implements CountryService {

    private final CounterDao counterDao;

    @Autowired
    public CountryServiceImpl(CounterDao counterDao) {
        this.counterDao = counterDao;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public Counter list() {
        return this.counterDao.list();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public int increment(int num) {
        return this.counterDao.increment(num);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional
    public int decrement(int num) {
        return this.counterDao.decrement(num);
    }
}
