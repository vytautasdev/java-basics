package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestProducts {

    public static void main(String[] args) {

        var p1 = new Products(1, "Tv", 1500, 1, "Apple", 0);
        var p2 = new Products(2, "Mobile", 800, 3, "Samsung", 0);
        var p3 = new Products(3, "Tripod", 150, 2, "Mi", 20);
        var p4 = new Products(4, "CCTV", 200, 10, "Digitech", 10);
        var p5 = new Products(5, "Mouse", 50, 5, "Logitech", 5);
        var p6 = new Products(6, "Bluetooth", 100, 3, "Boat", 5);
        var p7 = new Products(7, "Phone", 1000, 3, "Apple", 0);
        var p8 = new Products(8, "iPod", 100, 3, "Apple", 5);
        var p9 = new Products(9, "Tripod", 120, 2, "Mi", 6);

        ArrayList<Products> productList = new ArrayList<>();

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);
        productList.add(p8);
        productList.add(p9);

        List<String> newList = productList.stream()
                .filter(p -> p.brand.equals("Apple") && p.deliveryCharges > 0)
                .map(p -> p.pName)
                .collect(Collectors.toList());
        System.out.println(newList);


        for (Products prod :
                productList) {
            if (prod.brand.equals("Apple")) {
                if (prod.deliveryCharges > 0) {
                    System.out.println(prod);
                }
            }
        }

        var names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
        var result = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);

        System.out.println(productList.stream().count());

        System.out.println(productList.stream().min((x, y) -> x.price > y.price ? 1 : -1).get());
        System.out.println(productList.stream().max((x, y) -> x.price > y.price ? 1 : -1).get());

    }
}
