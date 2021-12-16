package com.example.pr9;

public class MovableCircle implements Moveable {
    private int radius;
    private int center;
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovableCircle(int radius, int center, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = center;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getRadius() {
        return radius;
    }

    public int getCenter() {
        return center;
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


    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                ", x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}