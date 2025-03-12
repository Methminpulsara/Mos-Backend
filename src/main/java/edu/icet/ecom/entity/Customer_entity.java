package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter


@Entity
@Table (name = "customer")
public class Customer_entity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name;
    private String number;
    private String address;


}
