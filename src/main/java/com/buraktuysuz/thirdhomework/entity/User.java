package com.buraktuysuz.secondhomework.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "kullanici")
public class User {

    @SequenceGenerator(name = "generator", sequenceName = "user_id_seq")            // tablodaki primary key için artan değerli bir  user_id_seq adında sequence oluşturur
    @Id                                                                             // Tablonun primary keyini tanımlar
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)    // Yukarıda tanımlamış olduğumuz sequence değerinine göre Id nin sıralanacığını belirtir
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)                     // Tabloda karşılık gelecek adı, nullable ve boyut burda belirtilir, Belirtilmezse default değerler alır
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone", length = 15)
    private String phone;

    @Column(name = "username", length = 20)
    private String username;

    // Getter ve Setter metotları
    public Long getId() { return id;}
    public void setId(Long id) {id = id; }

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {firstName = firstName; }

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {lastName = lastName;}

    public String getEmail() { return email;}
    public void setEmail(String email) {  email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) {  phone = phone; }

    public String getUsername() { return username; }
    public void setUsername(String username) {  username = username; }
}
