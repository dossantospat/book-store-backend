package com.dspexpertise.bookstore.backend.infrastructure.webservice.impl;

import com.dspexpertise.bookstore.backend.infrastructure.model.AuthorDTO;
import com.dspexpertise.bookstore.backend.infrastructure.webservice.AuthorApi;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;
import java.util.List;

@Path("/")
@Service
public class AuthorApiServiceImpl implements AuthorApi {
    @Override
    public AuthorDTO addAuthor(AuthorDTO author) {
        return null;
    }

    @Override
    public List<AuthorDTO> authorsGet() {
        return null;
    }

    @Override
    public AuthorDTO deleteAuthor(Integer authorId) {
        return null;
    }

    @Override
    public AuthorDTO getAuthor(Integer authorId) {
        AuthorDTO author = new AuthorDTO();
        author.setId(1L);
        author.setName("toto");
        return author;
    }

    @Override
    public AuthorDTO updateAuthor(AuthorDTO author) {
        return null;
    }
}

