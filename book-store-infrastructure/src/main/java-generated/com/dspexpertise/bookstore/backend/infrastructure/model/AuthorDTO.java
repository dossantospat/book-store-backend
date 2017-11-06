package com.dspexpertise.bookstore.backend.infrastructure.model;

import com.dspexpertise.bookstore.backend.infrastructure.model.BookDTO;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class AuthorDTO  {
  
  @ApiModelProperty(value = "")
  private Long id = null;
  @ApiModelProperty(example = "Georges R.R. Martin.", value = "")
  private String name = null;
  @ApiModelProperty(value = "")
  private List<BookDTO> books = new ArrayList<BookDTO>();

 /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AuthorDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuthorDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get books
   * @return books
  **/
  public List<BookDTO> getBooks() {
    return books;
  }

  public void setBooks(List<BookDTO> books) {
    this.books = books;
  }

  public AuthorDTO books(List<BookDTO> books) {
    this.books = books;
    return this;
  }

  public AuthorDTO addBooksItem(BookDTO booksItem) {
    this.books.add(booksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    books: ").append(toIndentedString(books)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

