package br.dev.vasconcelos.smartcart.domain;

import br.dev.vasconcelos.smartcart.enums.CartStatus;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CART")
public class Cart {

    @Id
    private int id;
    @Column
    private CartStatus status;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

}
