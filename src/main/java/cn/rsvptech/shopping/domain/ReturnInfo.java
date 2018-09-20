package cn.rsvptech.shopping.domain;

public class ReturnInfo {
    private Integer userId;
    private Integer goodsId;
    private Integer number;
    private Integer status;

    public ReturnInfo() {}

    public ReturnInfo(Integer userId, Integer goodsId, Integer number, Integer status) {
        this.userId = userId;
        this.goodsId = goodsId;
        this.number = number;
        this.status = status;
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
        this.number = number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
