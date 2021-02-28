package it.academy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "T_PROMO")
public class Promo {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "PROMO_ID")
    private String promoId;

    @Column(name = "PR_PRODUCT_NAME")
    private String productName;

    @Column(name = "PR_DESC")
    private String description;

    @ManyToMany()
    @JoinTable(name = "T_PRODUCT_PROMO",
            joinColumns = {@JoinColumn(name = "PROMO_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PRODUCT_ID")}
    )
    private List<Product> products;

}


