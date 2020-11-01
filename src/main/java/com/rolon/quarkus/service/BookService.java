package com.rolon.quarkus.service;

import com.rolon.quarkus.data.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.Validator;

@ApplicationScoped
public class BookService {
    @Inject
    Validator bookValidator;

    public void checkBook(@Valid Book book){
         bookValidator.validate(book);
    }
}
