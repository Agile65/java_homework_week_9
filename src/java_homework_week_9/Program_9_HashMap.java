package java_homework_week_9;

import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program_9_HashMap {
    //main method
    public static void main(String[] args) {
        HashMap<String,Integer> people=new HashMap<>();
        //Storing the values in to the HashMap object people
        people.put("Rita",23);
        people.put("Max",20);
        people.put("Jack",10);
        people.put("Lily",4);
        people.put("Ella",10);
        //for each loop for iterating the values from Map
        for(HashMap.Entry<String,Integer> p: people.entrySet()){
            System.out.println(p.getKey() +" " + p.getValue());
        }
    }
}
