/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObjects;

/**
 *
 * @author dpokhrel
 */
public class FeedMessage {

  String title;
  String description;
  String link;
  String author;
  String guid;
  String image;
  String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }
  
  
   public String getImage() {
    return image;
  }
  public void setImage(String image) {
      this.image=image;
    }

  @Override
  public String toString() {
    return "FeedMessage [title=" + title + ", description=" + description
        + ", link=" + link + ", author=" + author + ", guid=" + guid
        + "]";
  }

    

} 