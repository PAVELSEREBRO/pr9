package com.example.pr9;

class MoveablePoint implements Moveable,  Nameable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
        System.out.println("Имя - Сварог");
    }
    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}