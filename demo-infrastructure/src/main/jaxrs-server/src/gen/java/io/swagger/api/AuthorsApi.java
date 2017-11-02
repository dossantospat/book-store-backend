package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AuthorsApiService;
import io.swagger.api.factories.AuthorsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Author;

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

@Path("/authors")


@io.swagger.annotations.Api(description = "the authors API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-10T20:59:28.233Z")
public class AuthorsApi  {
   private final AuthorsApiService delegate;

   public AuthorsApi(@Context ServletConfig servletContext) {
      AuthorsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AuthorsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AuthorsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AuthorsApiServiceFactory.getAuthorsApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new author", notes = "Add a new author to the library", response = Author.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Author created with success", response = Author.class, responseContainer = "List") })
    public Response addAuthor(@ApiParam(value = "The author to create." ) Author author
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addAuthor(author,securityContext);
    }
    @DELETE
    @Path("/{authorId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a single author", notes = "Deletes an existing author", response = Author.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operation successfull", response = Author.class, responseContainer = "List") })
    public Response deleteAuthor(@ApiParam(value = "Numeric ID of the author to delete.",required=true) @PathParam("authorId") Integer authorId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAuthor(authorId,securityContext);
    }
    @GET
    @Path("/{authorId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Returns a single author", notes = "Updates an existing author", response = Author.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operation successfull", response = Author.class, responseContainer = "List") })
    public Response getAuthor(@ApiParam(value = "Numeric ID of the author to get.",required=true) @PathParam("authorId") Integer authorId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAuthor(authorId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list authors", notes = "Returns a list of all the known authors", response = Author.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Operation successfull", response = Author.class, responseContainer = "List") })
    public Response listAuthors(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAuthors(securityContext);
    }
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Updates an author", notes = "Updates an existing author", response = Author.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Author updated with success", response = Author.class, responseContainer = "List") })
    public Response updateAuthor(@ApiParam(value = "The author to update." ) Author author
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAuthor(author,securityContext);
    }
}
