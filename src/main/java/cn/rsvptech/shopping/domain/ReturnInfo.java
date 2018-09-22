package cn.rsvptech.shopping.domain;

public class ReturnInfo {
    private Integer usersId;
    private Integer goodsId;
    private Integer number;
    private Integer status;

    public ReturnInfo() {}

    public ReturnInfo(Integer usersId, Integer goodsId, Integer number, Integer status) {
        this.usersId = usersId;
        this.goodsId = goodsId;
        this.number = number;
        this.status = status;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
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
