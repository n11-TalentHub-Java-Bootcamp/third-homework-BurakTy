package com.buraktuysuz.secondhomework.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "urun_yorum")
public class ProductComment {

    @SequenceGenerator(name = "generator", sequenceName = "product_review_id_seq")  // tablodaki primary key için artan değerli bir  product_review_id_seq adında sequence oluşturur
    @Id                                                                             // tablonun primary keyini tanımlar
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)    // yukarıda tanımlamış olduğumuz sequence değerinine göre Id nin sıralanacığını belirtir
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "comment", nullable = false, length = 500)                     // tabloda karşılık gelecek adı, nullaable ve boyut burda belirtilir
    private String comment;

    @Column(name = "comment_date", nullable = false, length = 50)
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;

    // iç içe geçen entitylerde çokfazla veri içermesi halinde sorunları önelemek için fetch LAZY verilerek bu verinin sadece istenildiğinde yüklenemesini sağlar
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product",foreignKey = @ForeignKey(name = "fk_product_review_product_id"))    // foreign key , column adı ve tanımı belirtilir
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user",foreignKey = @ForeignKey(name = "fk_product_review_user_id"))
    private User user;


    // Getter ve Setter metotları

    public Long getId() { return id;}
    public void setId(Long id) { id = id; }

    public String getComment() { return comment;  }
    public void setComment(String comment) { comment = comment; }

    public Date getCommentDate() { return commentDate; }
    public void setCommentDate(Date commentDate) { commentDate = commentDate; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public User getUser() { return user; }
    public void setUser(User user) { user = user; }
}
