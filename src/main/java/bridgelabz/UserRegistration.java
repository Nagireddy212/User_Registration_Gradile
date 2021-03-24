package bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration {
    public static void FirstName() {
        Scanner scan = new Scanner(System.in);
        String Expression = "^[A-Z]{1}+[a-z]{2,}";
        System.out.println("Enter your first name: ");
        String name = scan.next();
        String result = (Pattern.matches(Expression, name)) ? "Valid" : "InValid";
        System.out.println("First Name is " + result + " ");
    }
    public static void main(String[] args) {
        FirstName();
    }
}
