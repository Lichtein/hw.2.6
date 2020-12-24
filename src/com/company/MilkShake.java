package com.company;

public class MilkShake<T extends Number> implements Playable<String> {
    private T number1;
    private String mk;
    private T t;

    public MilkShake(T number1, String mk) {
        this.number1 = number1;
        this.mk = mk;
    }

    public MilkShake(T t) {
        this.t = t;
    }

    public String getMk() {
        return mk;
    }
    public T getNumber1() {
        return number1;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public void print() {
        System.out.println(" Состав Милк Шейка" + " " + getMk() + " " + getNumber1() + " %");
    }

    @Override
    public void Mixer(String s) {
        System.out.println("Брррр-Бррррр");
    }


}
