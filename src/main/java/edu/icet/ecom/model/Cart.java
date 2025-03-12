package edu.icet.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cart {


    private Integer cartId;
    private  Integer productID ;
    private String name;
    private Double price;
    private Integer qty;
    private Integer discount;
    private String availabillity;
    private String image;

}
