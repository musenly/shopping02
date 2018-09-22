package cn.rsvptech.shopping.domain;

import javax.persistence.*;

@Entity
@Table(name = "t_orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId")
    private Integer orderId;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "goodsId")
    private Integer goodsId;
    @Column(name = "Number")
    private Integer number;
    @Column(name = "amount")
    private Integer amount;

    public Orders() {}

    public Orders(Integer userId, Integer goodsId, Integer number, Integer amount) {
        this.goodsId = goodsId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.number= number;
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
        return number;
    }

    public void setNumber(Integer number) {
        number = number;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
