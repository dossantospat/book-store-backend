package com.dspexpertise.bookstore.backend.infrastructure.webservice.impl;

import com.dspexpertise.bookstore.backend.infrastructure.model.AuthorDTO;
import com.dspexpertise.bookstore.backend.infrastructure.model.BookDTO;
import com.dspexpertise.bookstore.backend.infrastructure.webservice.BookApi;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Path("/")
@Service
public class BookApiServiceImpl implements BookApi {
    public BookDTO addBook(AuthorDTO book) {
        // TODO: Implement...
        
        return null;
    }
    
    public BookDTO deleteBook(Integer bookId) {
        // TODO: Implement...
        
        return null;
    }
    
    public BookDTO getBook(Integer bookId) {
        BookDTO book = new BookDTO();
        book.setId(1L);
        book.setPublishedAt(LocalDate.now());
        book.setTitle("Le seigneur des anneaux");
        return book;
    }
    
    public List<BookDTO> listBooks() {
        List<BookDTO> books = new ArrayList<>();
        BookDTO book = new BookDTO();
        book.setId(1L);
        book.setPublishedAt(LocalDate.now());
        book.setTitle("Le seigneur des anneaux");
        books.add(book);
        return books;
    }
    
    public BookDTO updateBook(BookDTO book) {
        // TODO: Implement...
        
        return null;
    }
    
}

