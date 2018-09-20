package cn.rsvptech.shopping.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Integer userId;
    private Integer balance;
    private Integer status;

    public Account(){}

    public Account(Integer userId, Integer balance, Integer status) {
        this.userId = userId;
        this.balance = balance;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
