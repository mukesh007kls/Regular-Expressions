package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean userName(String firstName,String regex){
        return Pattern.matches(regex,firstName);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name:-");
        String regex="[A-Z]{1}[a-z]{2,}";
        String firstName=sc.nextLine();
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.userName(firstName,regex));
    }
}