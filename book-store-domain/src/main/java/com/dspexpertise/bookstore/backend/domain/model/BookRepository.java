package com.dspexpertise.bookstore.backend.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by patrick on 23/10/17.
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findBookById(Long Id);
}
