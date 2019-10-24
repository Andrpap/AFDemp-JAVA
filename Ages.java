
package ages;

import java.util.Scanner;
public class Ages {
    
    public static void main(String[] args) {
    System.out.println("How old are you?");
    Scanner age = new Scanner(System.in);  // Create a Scanner object
   
        int age1 = age.nextLine();
        if (age1<16){
            System.out.println("You cannot drive.");
        } else if (age1<17) {
            System.out.println("You can drive but not vote.");
        } else if (age1<21) {
            System.out.println("You can vote but not drink.");
        } else if (age1>=21) {
            System.out.println("You can do anything.");
        } else {
            System.out.println("Wrong input.");
        }
    }
}
