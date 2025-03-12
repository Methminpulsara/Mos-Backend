package edu.icet.ecom.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Customer {

    private Integer id ;
    private String name;
    private String number;
    private String address;


}
