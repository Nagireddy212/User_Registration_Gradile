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
    public static void LastName() {
        Scanner scan = new Scanner(System.in);
        String Expression = "^[A-Z]{1}+[a-z]{2,}";
        System.out.println("Enter your last name: ");
        String name = scan.next();
        String result = (Pattern.matches(Expression, name)) ? "Valid" : "InValid";
        System.out.println("Last Name is " + result + " ");
    }
    public static void EmailValidation() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Email: ");
        String email = scan.nextLine();
        System.out.println(email);
        String expression = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-z]{0,2})*";
        String result = (Pattern.matches(expression, email)) ? "Successfully Valid" : "Invalid";
        System.out.println("Email " + result + " ");
    }

    public static void PhoneNumberValidate() {
        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter mobile number with country code: ");
        String Number = number.nextLine();
        System.out.println(Number);
        String numberExp = "^[0-9]{2}+\\s+[0-9]{10}";
        String result = (Pattern.matches(numberExp, Number)) ? "Successfully Valid" : "InValid";
        System.out.println("Phone number is " +result+ " ");

    }

    public static void PasswordValidate() {
        Scanner Pswd = new Scanner(System.in);
        System.out.println("Please Enter your password: ");
        String Password = Pswd.nextLine();
        System.out.println(Password);
        String PassExp = "^[A-z]{1}+[a-z0-9]{7,}";
        String result = (Pattern.matches(PassExp, Password)) ? "Successfully Valid" : "InValid";
        System.out.println("Password is " +result+ " ");

    }

    public static void main(String[] args) {
        FirstName();
        LastName();
        EmailValidation();
        PhoneNumberValidate();
        PasswordValidate();
    }
}
