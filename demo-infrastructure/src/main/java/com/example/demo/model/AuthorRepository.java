package com.example.demo.model;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.QueryHint;

/**
 * Created by patrick on 23/10/17.
 */
@Component
public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findAuthorById(Long id);

    Author findOneById(Long id);

    Author findAuthorByFirstname(String firstname);
}
