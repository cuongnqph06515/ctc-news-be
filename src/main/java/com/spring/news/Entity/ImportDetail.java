package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "IIMPORT_DETAIL")
public class ImportDetail {

    @Id
    @Column(name = "IMPORT_DETAIL_ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "IMPORT_ID")
    private Import importId;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @Column(name = "QUANTITY")
    private Integer quantity;
}
