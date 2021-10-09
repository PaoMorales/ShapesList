package edu.uaslp.parcial2.Shapes;

import edu.uaslp.parcial2.Shapes.Shape;

public class Square extends Shape implements FigureWithSlides {
    public Square(){
        super("Square");
    }

    public void draw(){
        System.out.println("Square, 4 lados iguales");
    }

    @Override
    public int getSlidesCount() {
        return 4;
    }
}
