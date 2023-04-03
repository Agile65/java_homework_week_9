package java_homework_week_9;

import java.util.ArrayList;

/**7. Write a Java program to test if an array list is empty or not.
 *
 */
public class Program_7_IfArrayListEmpty {
    //creation of the array list
    ArrayList<String> list=new ArrayList<>();
    //main method
    public static void main(String[] args) {
        Program_7_IfArrayListEmpty obj=new Program_7_IfArrayListEmpty();
        boolean arrayEmpty=obj.isArrayListEmpty(String.valueOf(obj.list));
        //will return true as nothing in the array list
        System.out.println(arrayEmpty);
        //Added elements to array List
        obj.addElementsToList();
        //Printing the value of the ArrayList
        System.out.println(obj.list);
        //will return false as Array list is not empty
        arrayEmpty=obj.isArrayListEmpty(String.valueOf(obj.list));
        System.out.println(arrayEmpty);
    }
    //method to check if arrayList is empty
    public boolean isArrayListEmpty(String countryName){
        return list.isEmpty();
    }
    //method to add values in to the array List
    public void addElementsToList(){
        list.add("Rima");
        list.add("Max");
        list.add("Ben");
        list.add("Jack");
    }
}
