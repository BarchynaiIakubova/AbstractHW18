package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(321.2, (byte)5,"female", "Karusa" );
        Cow cow2 = new Cow(121.2, (byte)1,"male", "Cowchik" );
        Cow cow3 = new Cow(123.0, (byte)3,"female", "Karusa1" );
        Cow cow4 = new Cow(291.56, (byte)6,"female", "Karusa2" );
        Cow cow5 = new Cow(321.13, (byte)10,"female", "Karusa3" );
        Cow[] arCow1 = {cow1, cow2, cow3, cow4, cow5};
        Cow[] arCow2 = {cow5};

        Sheep sheep1 = new Sheep(102.0, (byte)2, "male", "Barashik");
        Sheep sheep2 = new Sheep(182.5, (byte)1, "male", "Shepo");
        Sheep sheep3 = new Sheep(152.23, (byte)3, "female", "Black Shepo");
        Sheep[] arSheep1 = {sheep1, sheep2, sheep3};
        Sheep[] arSheep2 = {sheep2};

        Horse horse1 = new Horse(500, (byte)3, "male", "Horsik");
        Horse horse2 = new Horse(200.56, (byte)1, "male", "Loshadik");
        Horse[] arHorse1 = {horse1, horse2};
        Horse[] arHorse2 = {horse1};

        Farm farm1 = new Farm("ELebaev street 2", "Barchynai Iakubova", arCow1, arSheep1, arHorse1);
        Farm farm2 = new Farm("Sokuluk Kalinin street 12", "Antonina", arCow2, arSheep2, arHorse2);

        System.out.println("__________________________________________");
        System.out.println(farm1 + "\nCows: " + arCow1.length);
        System.out.println(cow1 + "\n" + cow2 + "\n" + cow3 + "\n" + cow4 + "\n" + cow5 + "\nSheep:" + arSheep1.length);
        System.out.println(sheep1 + "\n" + sheep2 + "\n" + sheep3 + "\nHorses: " + arHorse1.length);
        System.out.println(horse1 + "\n" + horse2);

        System.out.println("__________________________________________");
        System.out.println(farm2 + "\nCows: " + arCow2.length);
        System.out.println(cow3 + "\nSheep: " + arSheep2.length);
        System.out.println(sheep2 + "\nHorses: " + arHorse2.length);
        System.out.println(horse1);
    }
}
