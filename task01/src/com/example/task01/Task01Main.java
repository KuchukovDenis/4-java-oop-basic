package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 17;
        p1.y = 54;
        Point p2 = new Point();
        p2.x = 79;
        p2.y = 22;

        System.out.println("Point 1:");
        p1.print();
        System.out.println(p1);
        System.out.println("Point 2:");
        p2.print();
        System.out.println(p2);
    }
}