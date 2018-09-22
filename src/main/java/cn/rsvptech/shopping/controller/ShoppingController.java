package cn.rsvptech.shopping.controller;

import cn.rsvptech.shopping.domain.*;
import cn.rsvptech.shopping.repository.AccountRepository;
import cn.rsvptech.shopping.repository.GoodsRepository;
import cn.rsvptech.shopping.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

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

    //更新accout和goods表，并生成订单
    @RequestMapping("/buy")
    public ReturnInfo save(@RequestParam(name = "userid") Integer userId, @RequestParam(name = "goodid")
                                Integer goodId, Integer number) {

        ReturnInfo returnInfo = null;

        int balance = getAccount(userId).getBalance();
        int shopPrice = getGoods(goodId).getShopPrice();
        int goodsStock = getGoods(goodId).getGoodsStock();
        int newBalance = balance - shopPrice * number;
        int newGoodsStock = goodsStock - number;
        int amount = shopPrice * number;
        int status = 1;

        if (balance <= 0 || newBalance < 0 || goodsStock <= 0 || newGoodsStock < 0) {
            status = 0;
            System.out.println("账户余额或库存不足");
        } else {
            accountRepository.save(new Account(userId, (Integer)newBalance, (Integer)status));

            goodsRepository.save(new Goods(userId, getGoods(goodId).getGoodsSn(), getGoods(goodId).getGoodsName(),
                                    shopPrice, newGoodsStock));

            ordersRepository.save(new Orders(userId, goodId, number, amount));
        }

        returnInfo = new ReturnInfo(userId, goodId, number, status);

        return returnInfo;
    }

    @RequestMapping(name = "/Summary")
    public Summary getSummary() {
        List<Orders> listOrders = ordersRepository.findAll();
        Set<Integer> setUsers = new HashSet<>();
        AtomicLong amount = new AtomicLong();
        AtomicLong number = new AtomicLong();

        for (Orders order : listOrders) {
            setUsers.add(order.getUserId());
            amount.addAndGet(order.getAmount());
            number.addAndGet(order.getNumber());
        }

        Summary summary = new Summary();
        summary.setAllOrderId(listOrders.size());
        summary.setAllUserId(setUsers.size());
        summary.setAllAmount(amount.get());
        summary.setAllBuyShopNum(number.get());

        return summary;
    }

}













