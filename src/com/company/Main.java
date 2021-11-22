package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Boss dio = new Boss();
        dio.setBossHealth(100000);
        dio.setBossDamage(1000);
        dio.setBossDefense("the world");
        System.out.println("Boss health: " + dio.getBossHealth() + " " + "Boss damage: " + " " + "Boss defense: " + dio.getBossDefense());


        Hero[] tipeHeroes = createHeroes();
        for (int i = 0; i < tipeHeroes.length; i++) {
            System.out.println(tipeHeroes[i].getHealth() + ": " + tipeHeroes[i].getDamage() + ": " + tipeHeroes[i].getSuperPower());

        }
    }

    public static Hero[] createHeroes() {
        Hero Sasuke = new Hero(1000, 200, "");
        Hero Jotaro = new Hero(10000, 500, "");
        Hero Kazuma = new Hero(100, 1, "Krazha");
        Hero[] tipyHeroes = {Sasuke, Jotaro, Kazuma};
        return tipyHeroes;

    }
}