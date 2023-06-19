package br.dev.vasconcelos.smartcart.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "PRODUCT_PRICE")
public class ProductPrice {

    @Id
    private int id;
    @Column
    private int productId;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAT;
    @Column
    private boolean defaultPrice;
    @Column
    private LocalDateTime startPrice;
    @Column
    private LocalDateTime endPrice;

}
