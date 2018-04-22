package ru.practice.service;

import ru.practice.model.Counter;

/**
 * Service для работы с Counter
 */
public interface CountryService {

    /**
     * @return
     */
    Counter list();

    /**
     * @@param num
     */
    int increment(int num);

    /**
     * @@param num
     */
    int decrement(int num);
}
