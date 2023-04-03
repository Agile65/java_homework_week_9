package java_homework_week_9;

import java.util.ArrayList;

/**6. Write a Java program to retrieve an element (at a specified index) from a given
 array list
 */

public class Program_6_RetriveElement {
    //main method
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ferrari");
        cars.add("Mercedes");
        cars.add("Hyundai");
        //Retriving an element (at a specified index) from given array list
        String tempCars=cars.get(1);
        System.out.println(tempCars);
    }
}
