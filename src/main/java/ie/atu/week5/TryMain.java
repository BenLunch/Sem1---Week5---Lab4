package ie.atu.week5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        while(true) {
            System.out.println("Enter your age: ");
            String text = sc.nextLine().trim();
            try{
                age = Integer.parseInt(text);
                System.out.println("Thanks! You entered the age: " + age);
                break;
            }catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

    }
}