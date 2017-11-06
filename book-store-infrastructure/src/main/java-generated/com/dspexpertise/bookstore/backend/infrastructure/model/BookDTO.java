package com.dspexpertise.bookstore.backend.infrastructure.model;

import com.dspexpertise.bookstore.backend.infrastructure.model.AuthorDTO;
import java.time.LocalDate;
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

public class BookDTO  {
  
  @ApiModelProperty(value = "")
  private Long id = null;
  @ApiModelProperty(example = "Game of thrones", value = "")
  private String title = null;
  @ApiModelProperty(value = "")
  private LocalDate publishedAt = null;
  @ApiModelProperty(value = "")
  private List<AuthorDTO> authors = new ArrayList<AuthorDTO>();

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

  public BookDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BookDTO title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get publishedAt
   * @return publishedAt
  **/
  public LocalDate getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(LocalDate publishedAt) {
    this.publishedAt = publishedAt;
  }

  public BookDTO publishedAt(LocalDate publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

 /**
   * Get authors
   * @return authors
  **/
  public List<AuthorDTO> getAuthors() {
    return authors;
  }

  public void setAuthors(List<AuthorDTO> authors) {
    this.authors = authors;
  }

  public BookDTO authors(List<AuthorDTO> authors) {
    this.authors = authors;
    return this;
  }

  public BookDTO addAuthorsItem(AuthorDTO authorsItem) {
    this.authors.add(authorsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
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

