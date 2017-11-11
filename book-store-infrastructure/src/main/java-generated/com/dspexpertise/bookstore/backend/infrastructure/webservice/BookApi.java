package com.dspexpertise.bookstore.backend.infrastructure.webservice;

import com.dspexpertise.bookstore.backend.infrastructure.model.AuthorDTO;
import com.dspexpertise.bookstore.backend.infrastructure.model.BookDTO;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/")
@Api(value = "/", description = "")
public interface BookApi  {

    @POST
    @Path("/books")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new book", tags={ "book",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Book created with success", response = BookDTO.class) })
    public BookDTO addBook(@Valid AuthorDTO book);

    @DELETE
    @Path("/books/{bookId}")
    @ApiOperation(value = "Deletes a single book", tags={ "book",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation successfull", response = BookDTO.class) })
    public BookDTO deleteBook(@PathParam("bookId") Integer bookId);

    @GET
    @Path("/books/{bookId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a single book", tags={ "book",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation successfull", response = BookDTO.class) })
    public BookDTO getBook(@PathParam("bookId") Integer bookId);

    @GET
    @Path("/books")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list books", tags={ "book",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation successfull", response = BookDTO.class, responseContainer = "List") })
    public List<BookDTO> listBooks();

    @PUT
    @Path("/books")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates a book", tags={ "book" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Book updated with success", response = BookDTO.class) })
    public BookDTO updateBook(@Valid BookDTO book);
}

