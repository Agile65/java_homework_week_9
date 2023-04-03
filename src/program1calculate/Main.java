package program1calculate;

import program1calculate.Calculator;

import java.util.Scanner;

//1.Java program
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("Enter first Number : ");
            int a=scanner.nextInt();
            System.out.print("Enter second Number : ");
            int b=scanner.nextInt();
            System.out.print("Please enter one of the symbol +,-,*,/ : ");
            char symbol=scanner.next().charAt(0);
            Calculator calculator=new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.print("Would you like to do more calculation? Please enter \"Y\" or \"N\" : ");
            char s=scanner.next().charAt(0);
//            if(s!='y'||s!='Y'||s!='n'||s!='N')
//                System.out.print("Please enter valid character for Yes or No \"Y\" or \"N\" : ");
            if (s=='N'||s=='n')
                break;
        }
    }
}
