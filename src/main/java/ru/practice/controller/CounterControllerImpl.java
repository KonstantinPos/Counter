package ru.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.practice.model.Counter;
import ru.practice.service.CountryService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * {@inheritDoc}
 */
@RestController
@RequestMapping(value = "/", produces = APPLICATION_JSON_VALUE)
public class CounterControllerImpl implements CounterController {

    private final CountryService countryService;

    @Autowired
    public CounterControllerImpl(CountryService countryService) {
        this.countryService = countryService;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/number", method = {GET})
    public Counter list() {
        return countryService.list();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/number1/{num}", method = POST)
    public int increment(@PathVariable("num") int num) {
            return countryService.increment(num);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/number2/{num}", method = DELETE)
    public int decrement(@PathVariable("num") int num) {
        return countryService.decrement(num);
    }
}
