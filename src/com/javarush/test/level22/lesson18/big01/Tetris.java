package com.javarush.test.level22.lesson18.big01;

import java.awt.event.KeyEvent;

public class Tetris {
    private Field field;
    private Figure figure;
    private boolean isGameOver;

    public Tetris(int width, int height) {
        field = new Field(width, height);
        figure = null;
    }

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void run() throws Exception {
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        isGameOver = false;
        figure = FigureFactory.createRandomFigure(field.getWidth() / 2, 0);

        while (!isGameOver) {
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                if (event.getKeyChar() == 'q') return;
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    figure.left();
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    figure.right();
                else if (event.getKeyCode() == 12)
                    figure.rotate();
                else if (event.getKeyCode() == KeyEvent.VK_SPACE)
                    figure.downMaximum();
            }
            step();
            field.print();
            Thread.sleep(300);
        }
        System.out.println("Game Over");
    }

    public void step() {
        //опускам фигурку вниз

        //если разместить фигурку на текущем месте невозможно:
        //поднимаем обратно
        //приземляем
        //если фигурка приземлилась на самом верху - игра окончена
        //удаляем заполненные линии
        //создаем новую фигурку

    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public static Tetris game;

    public static void main(String[] args) throws Exception {
        game = new Tetris(10, 20);
        game.run();
    }
}
