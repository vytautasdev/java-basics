package org.example.exercise;

import org.example.Shape;

import java.util.List;

public class FurnitureTest {

    public void makeFurniture(List<? extends Furniture> list) {
        for (var item :
                list) {
            item.produceFurniture();
        }
    }
}
