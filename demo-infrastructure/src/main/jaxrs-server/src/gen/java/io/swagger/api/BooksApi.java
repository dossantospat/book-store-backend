package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BooksApiService;
import io.swagger.api.factories.BooksApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Author;
import io.swagger.model.Book;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/books")


@io.swagger.annotations.Api(description = "the books API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-10T20:59:28.233Z")
public class BooksApi  {
   private final BooksApiService delegate;

   public BooksApi(@Context ServletConfig servletContext) {
      BooksApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BooksApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BooksApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BooksApiServiceFactory.getBooksApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new book", notes = "Add a new book to the library", response = Book.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Book created with success", response = Book.class, responseContainer = "List") })
    public Response addBook(@ApiParam(value = "The book to create." ) Author book
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addBook(book,securityContext);
    }
    @DELETE
    @Path("/{bookId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a single book", notes = "Deletes an existing book", response = Book.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operation successfull", response = Book.class, responseContainer = "List") })
    public Response deleteBook(@ApiParam(value = "Numeric ID of the book to delete.",required=true) @PathParam("bookId") Integer bookId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteBook(bookId,securityContext);
    }
    @GET
    @Path("/{bookId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Returns a single book", notes = "Updates an existing book", response = Book.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operation successfull", response = Book.class, responseContainer = "List") })
    public Response getBook(@ApiParam(value = "Numeric ID of the book to get.",required=true) @PathParam("bookId") Integer bookId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBook(bookId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list books", notes = "Returns a list of all the known books", response = Book.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operation successfull", response = Book.class, responseContainer = "List") })
    public Response listBooks(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listBooks(securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Updates a book", notes = "Updates an existing book", response = Book.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Book updated with success", response = Book.class, responseContainer = "List") })
    public Response updateBook(@ApiParam(value = "The book to update." ) Book book
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateBook(book,securityContext);
    }
}
