package com.max.team.domain;

/**
 * ClassName: NoteBook
 * Package: com.max.team.domain
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 09:05
 * @Version 1.0
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
