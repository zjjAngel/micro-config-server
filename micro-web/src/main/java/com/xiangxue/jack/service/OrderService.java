package com.xiangxue.jack.service;


import com.xiangxue.jack.bean.ZgOrder;

public interface OrderService {
    ZgOrder queryOrderById(String orderId);

    String addOrder(ZgOrder zgOrder);
}
