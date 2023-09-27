package com.online.store.services;

import com.online.store.entetie.Order;

public interface OrderManagementService {
    void addOrder(Order order);

    Order[] getOrdersByUserId(int userId);

    Order[] getOrders();
}
