/* Activity 1.2 - Question 3 */
import java.util.Scanner;


class Question3 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
    String name; 
    String adj;

    System.out.println("Hi there. What is your name?");

    System.out.println("What adjective describes you?");

    name = scan.nextLine();
    adj = scan.nextLine();
        System.out.println("My name is " + name + ". I am " + adj);      

    }
}