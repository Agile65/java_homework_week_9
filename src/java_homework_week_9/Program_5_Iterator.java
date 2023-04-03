package java_homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

/**5. Write a Java program to iterate through all elements in an array list using
 Iterater.
 */

public class Program_5_Iterator {
    public static void main(String[] args) {
        //Creating an Array List and adding value
        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        //Iterate through all elements in ArrayList using Iterator
        Iterator<Integer>iterator=number.iterator();
        //While loop
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
