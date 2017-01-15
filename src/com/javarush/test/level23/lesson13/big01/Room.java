package com.javarush.test.level23.lesson13.big01;

public class Room {
    public int width;
    public int height;
    public Snake snake;
    public Mouse mouse;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        Room game;
        Snake snake = new Snake(5, 5);
        snake.direction = SnakeDirection.DOWN;
        Room room = new Room(10, 10, snake);
    }

    public void run() {

    }

    public void print() {

    }
}
