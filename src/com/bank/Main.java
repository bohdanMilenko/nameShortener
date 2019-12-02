package com.bank;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String fullName = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        String firstName;
        String lastNameLetter;

        if(fullName.contains(" ")) {
            for (int i = 0; i <= fullName.length()-1; i++) {
                char loopingChar = fullName.charAt(i);
                if(loopingChar == ' '){
                    firstName = fullName.substring(0,i);
                    lastNameLetter = fullName.substring(i+1,i+2);
                    sb.append(firstName).append(", ").append(lastNameLetter).append(".");
                }
            }
        }else {
            sb.append(fullName).append(", Esq.");
        }
        System.out.println(sb.toString());

    }

    //Took 18 minutes.
}
