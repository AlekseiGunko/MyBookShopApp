package com.example.MyBookShopApp.entity.struct.book.file;


import com.example.MyBookShopApp.entity.struct.enums.FileType;
import jakarta.persistence.*;


@Entity
@Table(name = "book_file_type")
public class BookFileTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(columnDefinition = "VARCHAR(255)", nullable = false)
    private FileType name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FileType getName() {
        return name;
    }

    public void setName(FileType name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
