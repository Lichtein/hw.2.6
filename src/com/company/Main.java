package com.company;

public class Main {

    public static void main(String[] args) {
        MilkShake<Double> MilkShake  = new MilkShake<>(40.1,"Мороженное");
        MilkShake.print();
        MilkShake<Integer> milkShake1 = new MilkShake<>(60,"Молоко");
        milkShake1.print();
        MilkShake<Double> milkShake2 = new MilkShake<>(0.9,"Красители");
        milkShake2.print();
        MilkShake<Integer> milkShake3 = new MilkShake<>(1000000000, "Счастья");
        milkShake3.print();
    }
}

