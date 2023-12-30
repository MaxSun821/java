package com.max.team.domain;

/**
 * ClassName: Printer
 * Package: com.max.team.domain
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 09:10
 * @Version 1.0
 */
public class Printer implements Equipment{
    private String name;
    private String type;

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
