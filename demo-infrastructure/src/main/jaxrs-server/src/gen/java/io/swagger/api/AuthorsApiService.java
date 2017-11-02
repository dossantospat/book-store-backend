package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Author;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-10T20:59:28.233Z")
public abstract class AuthorsApiService {
    public abstract Response addAuthor(Author author,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteAuthor(Integer authorId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAuthor(Integer authorId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAuthors(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAuthor(Author author,SecurityContext securityContext) throws NotFoundException;
}
