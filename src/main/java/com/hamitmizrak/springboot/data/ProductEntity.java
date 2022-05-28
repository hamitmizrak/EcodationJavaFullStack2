package com.hamitmizrak.springboot.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//Entity
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id",updatable = false)
    private long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_trade")
    private String productTrade;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdDate;
}


