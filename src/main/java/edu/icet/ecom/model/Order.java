package edu.icet.ecom.model;

import edu.icet.ecom.entity.OrderDetail_entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Order {

    private Integer id;
    private Integer customerID;
    private Double total;
    private String date;
    private List<OrderDetail_entity> orderDetail;

}
