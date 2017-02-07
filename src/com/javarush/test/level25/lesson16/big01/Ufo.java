package com.javarush.test.level25.lesson16.big01;

public class Ufo extends BaseObject {
    private static int step = 0;

    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Ufo(double x, double y) {
        super(x, y, 3);
    }

    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
    }

    public void move() {
        step++;
        double dx = Math.random() * 2 - 1;
        double dy = Math.random() * 2 - 1;
        x = x + dx;
        y = y + dy;
        checkBorders(radius, Space.game.getWidth() - radius + 1, Space.game.getHeight() / 2, Space.game.getHeight() + 1);
        if (step % 10 == 0) {
            fire();
        }
    }

    public void fire() {
        Space.game.getBombs().add(new Bomb(x, y));
    }
}
