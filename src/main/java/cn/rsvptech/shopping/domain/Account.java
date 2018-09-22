package cn.rsvptech.shopping.domain;


import javax.persistence.*;

@Entity
@Table(name = "t_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "balance")
    private Integer balance;
    @Column(name = "status")
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
