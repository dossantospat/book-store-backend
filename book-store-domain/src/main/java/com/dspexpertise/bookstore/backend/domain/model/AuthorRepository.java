package com.dspexpertise.bookstore.backend.domain.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by patrick on 23/10/17.
 */
@Component
public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findAuthorById(Long id);

    Author findOneById(Long id);

    Author findAuthorByFirstname(String firstname);
}
