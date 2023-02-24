package com.csc205.project2;

public class Pyramid extends Shape {

    private double width;
    private double height;
    private double sides = 4;

    public Pyramid(){
        super();
        this.width = 0.0;
        this.height = 0.0;
    }

    public Pyramid(double w,double h){
        super();
        this.width = w;
        this.height = h;
    }

    public double getWidth(){ return width;}

    public void setWidth(double width){this.width = width;}

    public double getHeight(){ return height;}

    public void setHeight(double height){this.height = height;}

    public double surfaceArea(){ return (Math.pow(width, 2)) + 2 * width * Math.sqrt(((Math.pow(width, 2))/4)+ Math.pow(height, 2));}

    public double volume(){ return Math.pow(width, 2) * (height/3.0);}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pyramid{");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append(", Sides=").append(sides);
        sb.append('}');
        return sb.toString();
    }
}
