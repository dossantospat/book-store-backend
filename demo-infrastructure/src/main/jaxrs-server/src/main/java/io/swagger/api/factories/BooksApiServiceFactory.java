package io.swagger.api.factories;

import io.swagger.api.BooksApiService;
import io.swagger.api.impl.BooksApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-10-10T20:59:28.233Z")
public class BooksApiServiceFactory {
    private final static BooksApiService service = new BooksApiServiceImpl();

    public static BooksApiService getBooksApi() {
        return service;
    }
}
