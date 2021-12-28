package com.buraktuysuz.thirdhomework.dto;


import java.util.Date;

public class ProductCommentDto {

    private String comment;
    private Date commentDate;
    private String productId;
    private String userId;


    // Getter ve Setter metotları

    public String getComment() { return comment; }

    public Date getCommentDate() {
        return commentDate;
    }
    public String getProductId() { return productId;  }
    public String getUserId() { return userId; }
}
