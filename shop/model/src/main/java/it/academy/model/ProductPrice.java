package it.academy.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "T_PRODUCT_PRICE")
public class ProductPrice {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    @Column(name = "PRICE_ID")
    private String priceId;

    @Column(name = "P_VALUE")
    private BigDecimal priceValue;

    @Column(name = "P_CURRENCY")
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
}

enum Currency {
    BYN, EUR, USD
}
