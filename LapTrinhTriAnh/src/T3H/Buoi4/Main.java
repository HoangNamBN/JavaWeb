package T3H.Buoi4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = { "Honda", "BMW", "Ford", "Mazda" };
        // sap xep mangr cars theo thu tu tang dan
        Arrays.sort(cars);
        System.out.println("Mảng cars sau khi được sắp xếp:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
