package com.dspexpertise.bookstore.backend.infrastructure.webservice;

import com.dspexpertise.bookstore.backend.infrastructure.model.AuthorDTO;

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
public interface AuthorApi  {

    @POST
    @Path("/authors")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Add a new author", tags={ "author",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Author created with success", response = AuthorDTO.class, responseContainer = "List") })
    public List<AuthorDTO> addAuthor(@Valid AuthorDTO author);

    @GET
    @Path("/authors")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list authors", tags={ "author",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation successfull", response = AuthorDTO.class, responseContainer = "List") })
    public List<AuthorDTO> authorsGet();

    @DELETE
    @Path("/authors/{authorId}")
    @ApiOperation(value = "Deletes a single author", tags={ "author",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation successfull", response = AuthorDTO.class, responseContainer = "List") })
    public List<AuthorDTO> deleteAuthor(@PathParam("authorId") Integer authorId);

    @GET
    @Path("/authors/{authorId}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a single author", tags={ "author",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Operation successfull", response = AuthorDTO.class, responseContainer = "List") })
    public List<AuthorDTO> getAuthor(@PathParam("authorId") Integer authorId);

    @PUT
    @Path("/authors")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates an author", tags={ "author" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Author updated with success", response = AuthorDTO.class, responseContainer = "List") })
    public List<AuthorDTO> updateAuthor(@Valid AuthorDTO author);
}

