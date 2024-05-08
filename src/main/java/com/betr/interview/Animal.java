package com.betr.interview;

public class Animal {
    private final int id;
    private final int price;
    private final String type;
    private final String name;

    public Animal(int id, int price, String type, String name) {
        this.id = id;
        this.price = price;
        this.type = type;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
