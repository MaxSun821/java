package com.max.test8;

/**
 * ClassName: Order
 * Package: com.max.test8
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/23 10:36
 * @Version 1.0
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Order) {
            return ((Order)obj).orderId == this.orderId && ((Order)obj).orderName.equals(this.orderName);
        }
        return false;
    }
}
