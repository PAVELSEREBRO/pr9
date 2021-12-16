package com.example.pr9;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(45, 65, 24, 64);
        moveablePoint.moveUp();
        moveablePoint.getName();
        MovableRectangle movableRectangle = new MovableRectangle(34, 56,32,12,45,65);
        movableRectangle.moveDown();
        movableRectangle.getName();

    }
}