package com.example.MyBookShopApp.data;

public class Author {

    Integer id;
    Integer bookId;
    String authorName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "id=" + id +
                ", bookId=" + bookId +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
