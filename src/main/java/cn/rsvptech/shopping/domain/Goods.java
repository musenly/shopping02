package cn.rsvptech.shopping.domain;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goodsId")
    private Integer goodsId;
    @Column(name = "goodsSn")
    private String goodsSn;
    @Column(name = "goodsName")
    private String goodsName;
    @Column(name = "shopPrice")
    private Integer shopPrice;
    @Column(name = "goodsStock")
    private Integer goodsStock;

    public Goods() {}

    public Goods(Integer goodsId, String goodsSn, String goodsName, Integer shopPrice, Integer goodsStock) {
        this.goodsId = goodsId;
        this.goodsSn = goodsSn;
        this.goodsName = goodsName;
        this.shopPrice = shopPrice;
        this.goodsStock = goodsStock;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Integer shopPrice) {
        this.shopPrice = shopPrice;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }
}
