package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */

    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
//        throw new AssertionError();
    }

    /**
     * Возвращает координату точки по оси абсцисс
     *
     * @return координату точки по оси X
     */
    public double getX() {
        return this.x;
    }

    /**
     * Возвращает координату точки по оси ординат
     *
     * @return координату точки по оси Y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Подсчитывает расстояние от текущей точки до точки, переданной в качестве параметра
     *
     * @param point вторая точка отрезка
     * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        return Math.sqrt(Math.pow((this.getX() - point.getX()), 2) + Math.pow((this.getY() - point.getY()), 2));
    }

}