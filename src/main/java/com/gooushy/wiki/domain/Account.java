package com.gooushy.wiki.domain;

public class Account {
    private Integer id;
    private Integer uid;
    private Double money;

    private Uuser uuser;

    public Uuser getUuser() {
        return uuser;
    }

    public void setUuser(Uuser uuser) {
        this.uuser = uuser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
