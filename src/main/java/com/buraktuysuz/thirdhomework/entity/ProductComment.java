package com.buraktuysuz.thirdhomework.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("productcomments")
public class ProductComment {

    @Id
    private String id;
    private String comment;
    private Date commentDate;
    private String productId;
    private String userId;


    // Getter ve Setter metotları

    public String getId() { return id; }
    public void setId(String id) {  this.id = id; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public Date getCommentDate() {
        return commentDate;
    }
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getProduct() {
        return productId;
    }
    public void setProduct(String product) {
        this.productId = productId;
    }

    public String getUser() {
        return userId;
    }
    public void setUser(String userId) {
        this.userId = userId;
    }
}
