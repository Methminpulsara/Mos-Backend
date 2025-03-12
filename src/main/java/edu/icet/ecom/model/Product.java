package edu.icet.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {


    private  Integer id ;
    private String name;
    private Double price;
    private Integer discount;
    private String type;
    private String availability;
    private String image;
}
