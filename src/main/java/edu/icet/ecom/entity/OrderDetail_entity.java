package edu.icet.ecom.entity;

import edu.icet.ecom.model.Product;
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
@Table (name = "orderDetail")


public class OrderDetail_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDetailID;

    @ManyToOne()
    @JoinColumn(name = "orderID", referencedColumnName = "id" ,nullable = false)
    private Order_entity order;

    @ManyToOne()
    @JoinColumn(name = "productID" , referencedColumnName = "id" ,nullable = false)
    private Product_entity burgerID;

    private Integer qty;
    private Double unit_price;

}
