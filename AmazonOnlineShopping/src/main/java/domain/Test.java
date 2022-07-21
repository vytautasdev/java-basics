package domain;

public class Test {

    public static void main(String[] args) {
        var cal = new Calculator();
        Calculator.radius = 13.2;
        System.out.println(cal.areaOfCircle());
        Calculator.radius = Calculator.radius + 10;
        System.out.println(cal.areaOfCircle());
        Calculator.radius = Calculator.radius + 10;
        System.out.println(cal.areaOfCircle());

    }

}
