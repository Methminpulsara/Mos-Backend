package edu.icet.ecom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrderDetail {

    private Integer orderDetailID;
    private Integer burgerID;
    private Integer qty;
    private Double unit_price;

}
