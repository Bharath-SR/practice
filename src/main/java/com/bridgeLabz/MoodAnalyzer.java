package com.bridgeLabz;

import java.util.Scanner;

public class MoodAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String mood=input.next();
        if(mood.contains("Happy")){
            System.out.println("Iam Happy");
        }else if(mood.contains("Sad")){
            System.out.println("Iam sad");
        }else{
            System.out.println("Enter a valid mood");
        }


    }
}
