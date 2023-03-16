package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private boolean userName(String name,String regex){
        return Pattern.compile(regex).matcher(name).matches();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        UserRegistration userRegistration=new UserRegistration();
        System.out.println("Enter the choice to choose which function to implement:-\n1.First Name\n2.Last Name");
        int choice=sc.nextInt();
        switch (choice){
            case 1->userRegistration.firstName();
            case 2->userRegistration.lastName();
        }

    }

    private void lastName() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Last name:-");
        String regex="[A-Z]{1}[a-z]{2,}";
        String lastName=sc.nextLine();
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.userName(lastName,regex));
    }

    private void firstName(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name:-");
        String regex="[A-Z]{1}[a-z]{2,}";
        String firstName=sc.nextLine();
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.userName(firstName,regex));
    }
}