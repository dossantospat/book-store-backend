/**
 * Manage authors and their books
 * This API is used to manage authors and their books. An author can write multiples books and a book can be written by multiple authors
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import io.swagger.model.Author;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * API tests for AuthorApi
 */
public class AuthorApiTest {


    private AuthorApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://localhost:8080/services", AuthorApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Add a new author
     *
     * Add a new author to the library
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAuthorTest() {
        Author author = null;
        //List<Author> response = api.addAuthor(author);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Deletes a single author
     *
     * Deletes an existing author
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAuthorTest() {
        Integer authorId = null;
        //List<Author> response = api.deleteAuthor(authorId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Returns a single author
     *
     * Updates an existing author
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthorTest() {
        Integer authorId = null;
        //List<Author> response = api.getAuthor(authorId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Returns a list authors
     *
     * Returns a list of all the known authors
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAuthorsTest() {
        //List<Author> response = api.listAuthors();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Updates an author
     *
     * Updates an existing author
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAuthorTest() {
        Author author = null;
        //List<Author> response = api.updateAuthor(author);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}
