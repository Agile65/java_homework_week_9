package java_homework_week_9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Program_10_StationLine {
    //main method
    public static void main(String[] args) {

        char result;
        //London Zone 1 Station list
        System.out.println("London Zone 1 Stations : ");
        System.out.println("Bond Street, Covent Garden, Edgeware Road, Green Park, Holborn District, Kensington, London Bridge ,Oxford circus, Paddington, Westminster");
        HashMap<String,String> zone= new HashMap<>();
        zone.put("Bond Street","Jubilee");
        zone.put("Covent Garden"," Piccadily");
        zone.put("Edgeware Road","Circle, Hammersmith & City");
        zone.put("Green Park","Piccadily, Victoria");
        zone.put("Holborn District","Central, Piccadily");
        zone.put("Kensington","Circle, District");
        zone.put("Leicester Square","Piccadily");
        zone.put("Oxford circus","Bakerloo, Central");
        zone.put("Victoria","Central, Circle, District");
        zone.put("Westminster","Circle, District");
        //do while loop if user wants to continue
        do{
            //Scanner declaration for user
            Scanner scanner=new Scanner((System.in));
            System.out.print("Enter Station name from above list : ");
            //user can input station name and storing it
            String stationName=scanner.nextLine();
            //for each loop to find tube lines for the station
            for(String str:zone.keySet()){
                if(stationName.equalsIgnoreCase(str)){
                    System.out.println("Tube Lines : " +zone.get(str));
                }
            }
            System.out.println("");
            System.out.println("Do you want to check again? Y or N : ");
            result=scanner.next().charAt(0);
        }while(result=='Y'||result=='y');
    }
}
