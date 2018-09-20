package cn.rsvptech.shopping.controller;

import cn.rsvptech.shopping.domain.Account;
import cn.rsvptech.shopping.domain.Goods;
import cn.rsvptech.shopping.domain.Orders;
import cn.rsvptech.shopping.domain.ReturnInfo;
import cn.rsvptech.shopping.repository.AccountRepository;
import cn.rsvptech.shopping.repository.GoodsRepository;
import cn.rsvptech.shopping.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    GoodsRepository goodsRepository;

    @Autowired
    OrdersRepository ordersRepository;

    public Account getAccount(Integer userId) {
        Account account = accountRepository.findByUserId(userId);
        return account;
    }

    public Goods getGoods(Integer goodsId) {
        Goods goods = goodsRepository.findByGoodsId(goodsId);
        return goods;
    }

    @RequestMapping("/buy")
    public ReturnInfo save(Integer userid, Integer goodsid, Integer number) {

        ReturnInfo returnInfo = null;

        int balance = getAccount(userid).getBalance();
        int shopPrice = getGoods(goodsid).getShopPrice();
        int goodsStock = getGoods(goodsid).getGoodsStock();
        int newBalance = balance - shopPrice * number;
        int newGoodsStock = goodsStock - number;
        int amount = shopPrice * number;
        int status = 1;

        if (balance <= 0 || newBalance < 0 || goodsStock <= 0 || newGoodsStock < 0) {
            status = 0;
            System.out.println("账户余额或库存不足");
        } else {
            accountRepository.save(new Account(userid, (Integer)newBalance, (Integer)status));

            goodsRepository.save(new Goods(goodsid, getGoods(goodsid).getGoodsSn(), getGoods(goodsid).getGoodsName(),
                                    shopPrice, newGoodsStock));

            ordersRepository.save(new Orders(null, userid, goodsid, number, amount));
        }

        returnInfo = new ReturnInfo(userid, goodsid, number, status);

        return returnInfo;
    }

}













