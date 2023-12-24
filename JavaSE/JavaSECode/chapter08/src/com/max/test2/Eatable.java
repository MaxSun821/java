package com.max.test2;

/**
 * ClassName: Eatable
 * Package: com.max.test2
 * Description: 吃饭接口
 *
 * @Author MaxSun
 * @Create 2023/12/24 11:45
 * @Version 1.0
 */
public interface Eatable {
    public abstract void eat();
}
class Chinese implements Eatable {

    @Override
    public void eat() {
        System.out.println("用筷子吃饭");
    }
}
class American implements Eatable {

    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}
class Indian implements Eatable {

    @Override
    public void eat() {
        System.out.println("用手抓饭");
    }
}
