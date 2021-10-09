package edu.uaslp.parcial2;
import edu.uaslp.parcial2.Shapes.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        PoligonoRegular poligonoRegular = new PoligonoRegular(5);
        Circle circle = new Circle();

        List<Shape> shapesList = new LinkedList<>();

        shapesList.add(square);
        shapesList.add(rectangle);
        shapesList.add(triangle);
        shapesList.add(poligonoRegular);
        shapesList.add(circle);

        printItems(shapesList);
    }

    public static void printItems(List items){
        for (Object item: items){
            if (item instanceof Square){
                ((Square)item).draw();
            }else if (item instanceof Rectangle){
                ((Rectangle)item).draw();
            }else if (item instanceof Triangle){
                ((Triangle)item).draw();
            }else if (item instanceof PoligonoRegular){
                ((PoligonoRegular)item).draw();
            }else if (item instanceof Circle){
                ((Circle)item).draw();
            }
        }
    }

    public static void printItems2(List<Shape>items){
        for (Shape item: items){
            System.out.println(item.getName() + "----");
            item.draw();
        }
    }
}
