package cn.rsvptech.shopping.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_orders")
public class Orders {

    @Id
    @GeneratedValue
    private Integer orderId;
    private Integer userId;
    private Integer goodsId;
    private Integer Number;
    private Integer amount;

    public Orders() {}

    public Orders(Integer orderId, Integer userId, Integer goodsId, Integer number, Integer amount) {
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.userId = userId;
        this.goodsId = goodsId;
        Number = number;
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
