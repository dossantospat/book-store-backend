package com.dspexpertise.bookstore.backend.infrastructure.webservice.impl;

import com.dspexpertise.bookstore.backend.infrastructure.model.AuthorDTO;
import com.dspexpertise.bookstore.backend.infrastructure.model.BookDTO;
import com.dspexpertise.bookstore.backend.infrastructure.webservice.AuthorApi;
import com.dspexpertise.bookstore.backend.infrastructure.webservice.BookApi;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Path("/")
@Service
public class AuthorApiServiceImpl implements AuthorApi {
    @Override
    public List<AuthorDTO> addAuthor(AuthorDTO author) {
        return null;
    }

    @Override
    public List<AuthorDTO> authorsGet() {
        return null;
    }

    @Override
    public List<AuthorDTO> deleteAuthor(Integer authorId) {
        return null;
    }

    @Override
    public List<AuthorDTO> getAuthor(Integer authorId) {
        List<AuthorDTO> authors = new ArrayList<>();
        AuthorDTO author = new AuthorDTO();
        author.setId(1L);
        author.setName("toto");
        authors.add(author);
        return authors;
    }

    @Override
    public List<AuthorDTO> updateAuthor(AuthorDTO author) {
        return null;
    }
}

