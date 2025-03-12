package edu.icet.ecom.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "products")


public class Product_entity {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private  Integer id ;
    private String name;
    private Double price;
    private Integer discount;
    private String type;
    private String availability;
    private String image;


    @JsonCreator
    public Product_entity(@JsonProperty("id") Integer id){
        this.id = id;
    }


}
