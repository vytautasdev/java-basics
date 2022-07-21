package org.example;

import java.util.List;

public class ShapeTest {

    public void drawShapes(List<? extends Shape> list) {
        for (var item :
                list) {
            item.draw();
        }
    }
}
