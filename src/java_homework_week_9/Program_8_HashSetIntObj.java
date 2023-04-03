package java_homework_week_9;

import java.util.HashSet;

/**8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 else)
  */
public class Program_8_HashSetIntObj {
    //Main method
    public static void main(String[] args) {
        //HashSet which stores integer objects
        HashSet<Integer> number=new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);
        //for loop
        for(int i=1;i<10 ;i++){
            //if...else
            if(number.contains(i)) {
                System.out.println(i + " is found in the Set");
            }else{
                System.out.println(i + " is not found in the Set");
            }
        }
    }
}
