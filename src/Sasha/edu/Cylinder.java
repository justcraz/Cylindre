package Sasha.edu;

import java.util.Objects;

/*
@USER: Java02
@DATE: 20.03.2021
@NAME: Cylinder

*/public class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Cylinder() {

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylinder cylinder = (Cylinder) o;
        return radius == cylinder.radius && height == cylinder.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }
    public double getSideArea(){
        double area = 2 * Math.PI * this.getRadius() * this.getHeight();
        return 0;
    }

    private int getHeight() {
        return 0;
    }
    public double getBaseArea(){
        double area = Math.PI * this.getRadius() * getRadius();
        return area;
    }

    public double getArea(){
        double area = this.getBaseArea() * 2 + this.getSideArea();
        return area;
    }

}
