package com.csc205.project2;

public interface ThreeDimensionalShape{
    public default double surfaceArea(){
        return surfaceArea();
    }
    public default double volume(){
        return volume();
    }

    abstract void Shape(String shape);
}
