package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "IPRODUCT")
public class Product {

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category_id;

    @ManyToOne
    @JoinColumn(name = "SENDER_ID")
    private Sender sender_id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE")
    private String price;

    @Column(name = "DESCRIPTIONS")
    private String descriptions;

    @Column(name = "STATUS")
    private Integer status;

}
