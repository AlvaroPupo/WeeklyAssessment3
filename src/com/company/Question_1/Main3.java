package com.company.Question_1;

public class Main3 extends Main2{

    public String owner;
    public int age;

    public Main3(String company, int earnings, String owner, int age) {
        super(company, earnings);
        this.owner = owner;
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

