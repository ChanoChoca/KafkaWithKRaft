package com.chanochoca.app.service;

import com.chanochoca.app.types.OrderStatus;
import com.chanochoca.app.dto.OrderHistory;

import java.util.List;
import java.util.UUID;

public interface OrderHistoryService {
    void add(UUID orderId, OrderStatus orderStatus);

    List<OrderHistory> findByOrderId(UUID orderId);
}
