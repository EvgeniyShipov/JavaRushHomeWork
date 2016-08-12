package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Евгений on 20.04.2016.
 */
public class TeaMaker extends DrinkMaker
{
    @Override
    void putIngredient()
    {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour()
    {
        System.out.println("Заливаем водой");
    }

    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для чая");
    }
}
