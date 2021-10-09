package edu.uaslp.parcial2.Shapes;

public class PoligonoRegular extends Shape {

    private int sides;

    public PoligonoRegular(int sides) {
        super("PoligonoRegular");
        this.sides = sides;
    }

    public void draw(){
        System.out.println("PoligonoRegular, con " + sides + "lados iguales");
    }

    public int getSides() {
        return sides;
    }
}
