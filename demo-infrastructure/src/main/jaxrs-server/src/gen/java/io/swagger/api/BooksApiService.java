package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Author;
import io.swagger.model.Book;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-10T20:59:28.233Z")
public abstract class BooksApiService {
    public abstract Response addBook(Author book,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteBook(Integer bookId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getBook(Integer bookId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listBooks(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateBook(Book book,SecurityContext securityContext) throws NotFoundException;
}
