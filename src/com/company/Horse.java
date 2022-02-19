package com.company;

public class Horse extends Animal {
    public Horse(double weight, byte age, String gender, String nickName) {
       super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
      return "weight: " + getWeight() + ", age: " + getAge() +
                ", gender: " + getGender() + ", nickName: " + getNickName();
    }
}
