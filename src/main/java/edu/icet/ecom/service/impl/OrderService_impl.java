package edu.icet.ecom.service.impl;

import edu.icet.ecom.entity.OrderDetail_entity;
import edu.icet.ecom.entity.Order_entity;
import edu.icet.ecom.entity.Product_entity;
import edu.icet.ecom.model.Order;
import edu.icet.ecom.repository.OrderDetail_repository;
import edu.icet.ecom.repository.Order_repository;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class OrderService_impl implements OrderService {

    final Order_repository orderRepository;
    final OrderDetail_repository orderDetailRepository;
    final ModelMapper mapper;

    @Override
    @Transactional
    public void add(Order order) {
       Order_entity orderEntity = new Order_entity();
       orderEntity.setDate(order.getDate());
       orderEntity.setCustomerID(order.getCustomerID());
       orderEntity.setTotal(order.getTotal());

       Order_entity saveOrder = orderRepository.save(orderEntity);

        List<OrderDetail_entity> orderDetail = order.getOrderDetail().stream().map(item-> {
            OrderDetail_entity orderDetailEntity = new OrderDetail_entity();
            orderDetailEntity.setOrder(saveOrder); // link krnw OrderDetail ekk
            orderDetailEntity.setBurgerID(mapper.map(item.getBurgerID(),Product_entity.class));
            orderDetailEntity.setQty(item.getQty());
            orderDetailEntity.setUnit_price(item.getUnit_price());
            return  orderDetailEntity;

        }).collect(Collectors.toList());

        orderDetailRepository.saveAll(orderDetail);
        saveOrder.setOrderDetail(orderDetail);
    }

    @Override
    public List<Order> getAll() {
        List<Order_entity> all = orderRepository.findAll();
        List<Order> orderList = new ArrayList<>();
        all.forEach(orderEntity -> {
            orderList.add(mapper.map(orderEntity,Order.class));
        });
        return orderList;
    }

    @Override
    public List<Order_entity> search(Integer id) {
        return orderRepository.findAllById(id);
    }
}
