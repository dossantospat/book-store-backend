package com.example.demo.infrastructure.services;

import com.example.demo.model.Author;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

//@Transactional
public interface GererTodoListService {

    @GET
    @Path("/")
    @Produces("application/json")
    List<Author> listerAuteurs();

    @GET
    @Path("/premier")
    @Produces("application/json")
    @Transactional
    Author getFirstAuthor();

    @GET
    @Path("/creer")
    void creerAuteurs();
}