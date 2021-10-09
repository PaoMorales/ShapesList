package edu.uaslp.parcial2.Shapes;

public abstract class Shape {
    private String name;

    Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void draw();
}
