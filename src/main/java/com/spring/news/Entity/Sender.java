package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ISENDER")
public class Sender {

    @Id
    @Column(name = "SENDER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @Column(name = "SENDER_NAME")
    private String senderName;

    @Column(name = "CONTACT_NAME")
    private String contactName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "REGION")
    private String region;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "FAX")
    private String fax;

}
