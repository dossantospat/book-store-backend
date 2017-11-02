package io.swagger.model;

import io.swagger.model.Book;
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

public class Author  {
  
  @ApiModelProperty(value = "")
  private Long id = null;
  @ApiModelProperty(example = "Georges R.R. Martin.", value = "")
  private String name = null;
  @ApiModelProperty(value = "")
  private List<Book> books = new ArrayList<Book>();

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

  public Author id(Long id) {
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

  public Author name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get books
   * @return books
  **/
  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }

  public Author books(List<Book> books) {
    this.books = books;
    return this;
  }

  public Author addBooksItem(Book booksItem) {
    this.books.add(booksItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
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

