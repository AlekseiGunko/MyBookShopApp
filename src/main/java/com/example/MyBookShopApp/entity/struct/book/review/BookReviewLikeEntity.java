package com.example.MyBookShopApp.entity.struct.book.review;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "book_review_like")
public class BookReviewLikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(name = "review_id", nullable = false)
    private int reviewId;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime time;

    @Column(columnDefinition = "SMALLINT", nullable = false)
    private short value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public short getValue() {
        return value;
    }

    public void setValue(short value) {
        this.value = value;
    }
}
