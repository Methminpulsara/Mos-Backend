package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table (name = "cart")

public class Cart_entity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;

    @Column( nullable = false)
    private  Integer productID ;

    private String name;
    private Double price;
    private Integer qty;
    private Integer discount;
    private String availabillity;
    private String image;
}
