package edu.icet.ecom.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table (name = "orders")
public class Order_entity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer customerID;
    private Double total;
    private String date;


    @OneToMany(mappedBy = "order" ,cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<OrderDetail_entity> orderDetail;

}
