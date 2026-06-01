package com.aittr.javacollections.centaurus;

public class Centautus extends Person implements Horse{
    private String magicSkill;

    @Override
    public String toString() {
        return super.toString() + " have magic skill : " + this.magicSkill;
    }

    public Centautus(String name, int id, double age, String magicSkill) {
        super(name, id, age);
        this.magicSkill = magicSkill;
    }

    public String getMagicSkill() {
        return magicSkill;
    }

    public void setMagicSkill(String magicSkill) {
        this.magicSkill = magicSkill;
    }

    @Override
    public void toJump() {
        System.out.println("Centaurus " +super.getName() + " can jamp with " + Horse.legs + " legs");
    }
}
