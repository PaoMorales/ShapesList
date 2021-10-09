package edu.uaslp.parcial2.Shapes;

public class Rectangle extends Shape implements FigureWithSlides {

    public Rectangle(){
        super("Rectangle");
    }

    public void draw(){
        System.out.println("Rectangle, 4 lados ");
    }

    @Override
    public int getSlidesCount() {
        return 4;
    }
}
