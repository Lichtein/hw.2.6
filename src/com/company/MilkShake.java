package com.company;

public class MilkShake<T extends Number> implements Playable {
    private T number1;
    private String mk;

    public MilkShake(T number1, String mk) {
        this.number1 = number1;
        this.mk = mk;
    }
    public String getMk() {
        return mk;
    }
    public T getNumber1() {
        return number1;
    }
    @Override
    public void print() {
        System.out.println(" Состав Милк Шейка" + " " + getMk() + " " + getNumber1() + " %");
    }
}