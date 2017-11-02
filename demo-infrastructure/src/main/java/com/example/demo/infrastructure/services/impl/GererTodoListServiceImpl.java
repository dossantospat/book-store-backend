package com.example.demo.infrastructure.services.impl;

import com.example.demo.infrastructure.services.GererTodoListService;
import com.example.demo.model.Author;
import com.example.demo.model.AuthorRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.jpa.internal.EntityManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/")
@Service
//@Transactional
public class GererTodoListServiceImpl implements GererTodoListService {

    @Autowired
    AuthorRepository repository;

    @Autowired
    EntityManager entityManager;

    @Override
//    @Transactional
    public List<Author> listerAuteurs() {
        Session session = ((EntityManagerImpl) entityManager).getSession();
        Transaction tx = session.beginTransaction();
        System.out.println("start transaction");
        List<Author> authors = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            session.load(Author.class, 1L);
//            authors = repository.findAll();
        }
        tx.commit();
        System.out.println("stop transaction");
        return authors;
    }

    @Override
    @Transactional
    public Author getFirstAuthor()
    {
        Author author = null;
        for(int i = 0; i < 100; i++) {
            author = entityManager.find(Author.class, 1L);
//            author = repository.findOneById(1L);
//            author = repository.findOne(1L);
        }
        return author;
    }

    @Override
    public void creerAuteurs() {
        repository.save(new Author("Ernest", "Hemingway"));
        repository.save(new Author("Georges", "R.R. Martin"));
        repository.save(new Author("Guy", "De Maupassant"));
    }
}

