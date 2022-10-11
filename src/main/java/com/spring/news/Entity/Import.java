package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "IHUB_IMPORT")
public class Import {

    @Id
    @Column(name = "IMPORT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "HUB_ID")
    private Hub hub;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "CODE")
    private String code;

    @Column(name = "IMPORT_DATE")
    private Date importDate;

    @Column(name = "TOTAL_QUANTITY")
    private Integer totalQuantity;

    @Column(name = "TOTAL_PRODUCT")
    private Integer totalProduct;

    @Column(name = "TOTAL_MONEY")
    private Integer totalMoney;

    @Column(name = "DESCRIPTIONS")
    private String description;

    @Column(name = "STATUS")
    private Integer status;
}
