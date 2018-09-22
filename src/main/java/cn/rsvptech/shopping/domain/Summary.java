package cn.rsvptech.shopping.domain;

import java.util.concurrent.atomic.AtomicLong;

public class Summary {
    private Long allAmount;
    private Integer allOrderId;
    private Integer allUserId;
    private Long allBuyShopNum;

    public Summary() {
    }

    public Summary(Long allAmount, Integer allOrderId, Integer allUserId, Long allBuyShopNum) {
        this.allAmount = allAmount;
        this.allOrderId = allOrderId;
        this.allUserId = allUserId;
        this.allBuyShopNum = allBuyShopNum;
    }

    public Long getAllAmount() {
        return allAmount;
    }

    public void setAllAmount(Long allAmount) {
        this.allAmount = allAmount;
    }

    public Integer getAllOrderId() {
        return allOrderId;
    }

    public void setAllOrderId(Integer allOrderId) {
        this.allOrderId = allOrderId;
    }

    public Integer getAllUserId() {
        return allUserId;
    }

    public void setAllUserId(Integer allUserId) {
        this.allUserId = allUserId;
    }

    public Long getAllBuyShopNum() {
        return allBuyShopNum;
    }

    public void setAllBuyShopNum(Long allBuyShopNum) {
        this.allBuyShopNum = allBuyShopNum;
    }
}
