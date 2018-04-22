package ru.practice.controller;

import ru.practice.model.Counter;

/**
 * Controller для работы с Counter
 */
public interface CounterController {

    /**
     * Get counter
     * @return
     */
    Counter list();

    /**
     * Get increment counter
     * @return num
     */
    int increment(int num);

    /**
     * Get decrement counter
     * @return num
     */
    int decrement(int num);
}
