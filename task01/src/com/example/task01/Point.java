package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;
    public Point(){
        this.x = x;
        this.y = y;

    }
    void flip(){
        int a = x;
        x = -y;
        y = -a;
    }
    double distance(Point point){
        double d = Math.sqrt(Math.pow((x - point.x),2)+Math.pow((y - point.y),2));
        return d;
    }
    public String toString(){
        return "("+x+","+y+")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}