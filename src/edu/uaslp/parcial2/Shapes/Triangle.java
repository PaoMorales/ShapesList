package edu.uaslp.parcial2.Shapes;

import edu.uaslp.parcial2.Shapes.Shape;

public class Triangle extends Shape implements FigureWithSlides{
    public Triangle(){
        super("Triangle");
    }

    public void draw(){
        System.out.println("Triangle, 3 lados iguales");
    }

    @Override
    public int getSlidesCount() {
        return 3;
    }
}
