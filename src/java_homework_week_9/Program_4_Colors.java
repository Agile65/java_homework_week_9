package java_homework_week_9;

import java.util.ArrayList;

/**4. Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.
 */

public class Program_4_Colors {
    public static void main(String[] args) {
        //Creating an Array List and adding colours
        ArrayList<String> colour = new ArrayList<String>();
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Black");
        colour.add("Red");
        colour.add("Pink");
        colour.add("Purple");
        colour.add("Blue");
        colour.add("Grey");
        //System.out.print(colour);
        //Printing the collection using for each loop
        for ( String s:colour ){
            System.out.println(s);
        }
        //using Iterator with String
//        Iterator<String> iterator=colour.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
