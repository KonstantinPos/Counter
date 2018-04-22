package ru.practice.dao;

import ru.practice.model.Counter;

public interface CounterDao {

    /**
     * Текущее значение счетчика
     */
    Counter list();

    /**
     * Инкремент счетчик
     *
     * @param num
     * @return
     */
    int increment(int num);

    /**
     * Декремент счетчик
     *
     * @param num
     * @return
     */
    int decrement(int num);
}
