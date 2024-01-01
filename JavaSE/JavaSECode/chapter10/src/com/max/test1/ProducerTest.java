package com.max.test1;

/**
 * ClassName: ProducerTest
 * Package: com.max.test1
 * Description:生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，
 * 如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店
 * 中有产品了再通知消费者来取走产品。
 *
 * @Author MaxSun
 * @Create 2024/1/1 10:19
 * @Version 1.0
 */
public class ProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor = new Productor(clerk, "生产者：");
        Customer customer1 = new Customer(clerk, "消费者1：");
        Customer customer2 = new Customer(clerk, "消费者2：");

        productor.start();
        customer1.start();
        customer2.start();

    }
}

class Clerk {
    // 店员类
    private int product;
    public synchronized void addProduct() {
        // 增加产品方法
        if(product >= 20) {
            try {
                // 生产超过20个产品，等待消费者购买
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            product++;
            System.out.println(Thread.currentThread().getName() + "生产了第" + product + "个产品");
        }
        notify();
    }
    public synchronized void minusProduct() {
        // 增加产品方法
        if(product <= 0) {
            try {
                // 产品被消费完，等待生产
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "购买了第" + product + "个产品");
            product--;
        }
        notify();
    }
}

class Productor extends Thread{
    // 生产者类
    private Clerk clerk;
    public Productor(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

class Customer extends Thread{
    // 消费者类
    private Clerk clerk;
    public Customer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }

    }
}
