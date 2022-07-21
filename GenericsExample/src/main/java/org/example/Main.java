package org.example;

import org.example.exercise.Bed;
import org.example.exercise.Cot;
import org.example.exercise.FurnitureTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var obj = new ShapeTest();
        var furnitureTest = new FurnitureTest();
        var circleList = new ArrayList<Circle>();
        var c1 = new Circle();
        var c2 = new Circle();
        var c3 = new Circle();
        circleList.add(c1);
        circleList.add(c2);
        circleList.add(c3);
        obj.drawShapes(circleList);

        var triangleList = new ArrayList<Triangle>();
        var t1 = new Triangle();
        var t2 = new Triangle();
        var t3 = new Triangle();
        triangleList.add(t1);
        triangleList.add(t2);
        triangleList.add(t3);
        obj.drawShapes(triangleList);

        var cotList = new ArrayList<Cot>();
        var cot1 = new Cot();
        var cot2 = new Cot();
        var cot3 = new Cot();
        cotList.add(cot1);
        cotList.add(cot2);
        cotList.add(cot3);
        furnitureTest.makeFurniture(cotList);

        var bedList = new ArrayList<Bed>();
        var bed1 = new Bed();
        var bed2 = new Bed();
        var bed3 = new Bed();
        bedList.add(bed1);
        bedList.add(bed2);
        bedList.add(bed3);
        furnitureTest.makeFurniture(bedList);
    }
}