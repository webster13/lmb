package com.learn.lmb.entity;

/**
 * ToDo...
 * Created by Vince on 2016/3/17.
 */


public class Car {
    Integer id;
    String bland;
    String color;
    User owner;

    public String getBland() {
        return bland;
    }

    public void setBland(String bland) {
        this.bland = bland;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", bland='" + bland + '\'' +
                ", color='" + color + '\'' +
                ", owner=" + owner +
                '}';
    }
}
