package com.example.pr9;

class MovableRectangle implements Moveable, Nameable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    private int topLeft;
    private int bottomRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, int topLeft, int bottomRight) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public int getTopLeft() {
        return topLeft;
    }

    public int getBottomRight() {
        return bottomRight;
    }
    public void moveUp(){
        System.out.println("Движение вверх");
    }
    public void moveDown(){
        System.out.println("Движение вниз");
    }
    public void moveLeft(){
        System.out.println("Движение влево");
    }
    public void moveRight(){
        System.out.println("Движение вправо");
    }
    public void getName() {
        System.out.println("Имя - Шрек");
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}