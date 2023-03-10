package com.csc205.project2;

public class Cylinder extends Shape{

    private double radius;
    private double height;
    private int sides = 3;

    public Cylinder(){
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cylinder(double r, double h){
        super();
        this.radius = r;
        this.height = h;
    }

    public double getRadius(){return radius;}

    public void setRadius(double radius){this.radius = radius;}

    public double getHeight(){return height;}

    public void setHeight(double height){this.height = height;}

    public double surfaceArea(){return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI* Math.pow(radius,2));}

    public double volume(){return (Math.PI * Math.pow(radius,2) * height);}


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cylinder{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append(", Sides=").append(sides);
        sb.append('}');
        return sb.toString();
    }
}
