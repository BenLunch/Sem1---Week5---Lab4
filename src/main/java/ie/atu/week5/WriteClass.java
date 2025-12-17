package ie.atu.week5;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name (e.g. students.txt): ");
        String fileName = sc.nextLine().trim();

        System.out.println("Enter a student name to save: ");
        String name = sc.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true))){
            out.println(name);
            System.out.println("Saved to: " + fileName);
            out.close();
        }
        catch (IOException ex)
        {
            System.out.println("Could not write to file: " + ex.getMessage());
        }
    }
}
