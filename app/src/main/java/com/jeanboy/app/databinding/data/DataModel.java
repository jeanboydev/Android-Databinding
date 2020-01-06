package com.jeanboy.app.databinding.data;

/**
 * @author caojianbo
 * @since 2020/1/6 11:28
 */
public class DataModel {

    private String name;
    private int age;

    public DataModel() {
    }

    public DataModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
