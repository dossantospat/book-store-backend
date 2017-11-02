package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Author;
import io.swagger.model.Book;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class BookApiServiceImpl implements BookApi {
    public List<Book> addBook(Author book) {
        // TODO: Implement...
        
        return null;
    }
    
    public List<Book> deleteBook(Integer bookId) {
        // TODO: Implement...
        
        return null;
    }
    
    public List<Book> getBook(Integer bookId) {
        // TODO: Implement...
        
        return null;
    }
    
    public List<Book> listBooks() {
        // TODO: Implement...
        
        return null;
    }
    
    public List<Book> updateBook(Book book) {
        // TODO: Implement...
        
        return null;
    }
    
}

