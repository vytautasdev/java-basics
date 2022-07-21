package facadePat;

public class Test {

    public static void main(String[] args) {
        var c = new Circle();
        var s = new Square();
        var r = new Rectangle();
        c.draw();
        s.draw();
        r.draw();


        var sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawRectangle();
        sm.drawSquare();

    }

}
