package io.swagger.api.factories;

import io.swagger.api.AuthorsApiService;
import io.swagger.api.impl.AuthorsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-10T20:59:28.233Z")
public class AuthorsApiServiceFactory {
    private final static AuthorsApiService service = new AuthorsApiServiceImpl();

    public static AuthorsApiService getAuthorsApi() {
        return service;
    }
}
