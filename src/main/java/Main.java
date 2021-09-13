/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("What is your age? ");
        int age = input.nextInt();

        String msg="";

        System.out.println( msg = age > 15
                ? "You are old enough to legally drive."
                : "You are not old enough to legally drive.");

    }
}