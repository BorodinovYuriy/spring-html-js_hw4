package ru.gb.buv.springhtmljs.data;


public class Product {
    private int id;
    private String title;
    private int cost;
    public Product(){}
    public Product(int id,String title, int cost) {
        this.id = id;
        this.cost = cost;
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }

}