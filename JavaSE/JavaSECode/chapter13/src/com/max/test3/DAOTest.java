package com.max.test3;

import java.util.*;

/**
 * ClassName: DAOTest
 * Package: com.max.test3
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/7 10:59
 * @Version 1.0
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1", new User(101, 23, "zhangsan"));
        dao.save("2", new User(102, 24, "lisi"));
        dao.save("3", new User(103, 25, "wangwu"));
        dao.save("4", new User(104, 26, "zhaoliu"));
        dao.save("5", new User(105, 27, "tianqi"));
        dao.save("6", new User(106, 28, "wangba"));

        User u = dao.get("3");
        System.out.println(u);
        dao.update("2", new User(108, 32, "chenwu"));

        List<User> list = dao.list();

        System.out.println(list);

        dao.delete("5");
    }
}
class DAO<T> {
    private Map<String, T> map;

    public DAO() {
        map = new HashMap<>();
    }

    /**
     * 保存 T 类型的对象到 Map 成员变量中
     * @param id key
     * @param entity value
     */
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    /**
     * 从 map 中获取 id 对应的对象
     * @param id key
     * @return value
     */
    public T get(String id) {
        return map.get(id);
    }
    public void update(String id, T entity) {
        map.put(id, entity);
    }
    public List<T> list() {
        List<T> values = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        for (Map.Entry<String, T> entry : entries) {
            values.add(entry.getValue());
        }
        return values;
    }
    public void delete(String id) {
        map.remove(id);
    }
}
class User {
    private int id;
    private int age;
    private String name;

    public User() {
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
