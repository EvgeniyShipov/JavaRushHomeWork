package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        Horse h1 = new Horse("Johnny", 3, 0);
        Horse h2 = new Horse("Anna", 3, 0);
        Horse h3 = new Horse("Antony", 3, 0);
        game.getHorses().add(h1);
        game.getHorses().add(h2);
        game.getHorses().add(h3);

        game.run();
        game.printWinner();
    }

    public static Hippodrome game;
    ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();

    }

    public Horse getWinner() {
        double max = 0;
        for (Horse horse: horses) {
            if (max < horse.getDistance()) {
                max = horse.getDistance();
            }
        }
        for (Horse horse: horses) {
            if (max == horse.getDistance()) {
                return horse;
            }
        }
        return null;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
