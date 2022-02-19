package com.company;

public abstract class Animal {
    private double weight;
    private byte age;
    private String gender;
    private String nickName;

    public Animal() {

    }
    public Animal(double weight, byte age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public byte getAge() {
        return age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getNickName() {
        return nickName;
    }


}
