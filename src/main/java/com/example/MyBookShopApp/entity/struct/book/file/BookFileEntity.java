package com.example.MyBookShopApp.entity.struct.book.file;


import jakarta.persistence.*;

@Entity
@Table(name = "book_file")
public class BookFileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String hash;

    @Column(name = "type_id", nullable = false)
    private int typeId;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
