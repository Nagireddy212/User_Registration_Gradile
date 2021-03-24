package bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void CallMethods() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String Fname = scan.next();
        FirstName(Fname);

        System.out.println("Enter your Last name: ");
        String Lname = scan.next();
        LastName(Lname);

        System.out.print("Please Enter Email: ");
        String email = scan.next();
        EmailValidation(email);

        System.out.println("Please Enter mobile number with country code: ");
        String Number = scan.next();
        PhoneNumberValidate(Number);

        System.out.println("Please Enter your password: ");
        String password = scan.next();
        PasswordValidate(password);
    }

    public static String FirstName(String Fname) {
        String Expression = "^[A-Z]{1}+[a-z]{2,}";
        return (Pattern.matches(Expression, Fname)) ? "HAPPY" :  "SAD";
    }
    public static String LastName(String Lname) {
        String Expression = "^[A-Z]{1}+[a-z]{2,}";
        if (Pattern.matches(Expression, Lname))
            return "HAPPY";
        else
            return "SAD";

    }
    public static String EmailValidation(String email) {
        String expression = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-z]{0,2})*";
        if (Pattern.matches(expression, email))
            return "HAPPY";
        else
            return "SAD";
    }
    public static String PhoneNumberValidate(String Number) {
        String numberExp = "^[0-9]{2}+\\s+[0-9]{10}";
        if (Pattern.matches(numberExp, Number))
            return "HAPPY";
        else
            return "SAD";


    }
    public static String PasswordValidate(String password) {
        String PassExp = "^.*(?=.*[A-Z])(?=.*[0-9])([a-z])(?=.*[@#$%^&+=])(?=.{8,}).*$";
        if (Pattern.matches(PassExp, password))
            return "HAPPY";
        else
            return "SAD";


    }
    public static void main(String[] args) {
        UserRegistration userReg = new UserRegistration();
        userReg.CallMethods();
    }
}