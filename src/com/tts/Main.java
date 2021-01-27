package com.tts;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");     // type a word and hit enter
        String someString = scanner.next();

        System.out.print("Please enter your name: ");     // type a word and hit enter
        String someName = scanner.next();

        System.out.print("Would you like to enter the interactive portion? ");     // type a word and hit enter
        String someActivity = scanner.next();

        System.out.print("Do you have a red car? ");     // type a word and hit enter
        String someCar = scanner.next();

        System.out.print("Please name your favorite pet: ");     // type a word and hit enter
        String somePet = scanner.next();

        System.out.print("What is the age of your favorite pet? ");     // type a word and hit enter
        int someAge = scanner.nextInt();

        System.out.print("What is your lucky number? ");     // type a word and hit enter
        int someNum = scanner.nextInt();

        System.out.print("Who is your favorite quarterback? ");     // type a word and hit enter
        String someBack = scanner.next();

        System.out.print("What is his jersey number? ");     // type a word and hit enter
        int someJersey = scanner.nextInt();

        System.out.print("What is the two digit year model of your car: ");     // type a word and hit enter
        int someModel = scanner.nextInt();

        System.out.print("What is the first name of your favorite actor? ");     // type a word and hit enter
        String someActor = scanner.next();

        System.out.print("Enter a random number between 1-12: ");     // type a word and hit enter
        Integer someNum2 = scanner.nextInt();

       int magicBall = someJersey * someNum2;
       int numOne = someModel + someNum;
       int numTwo = 42;
       int numThree = someModel + someAge;
       int numFour = someJersey + someNum + someAge;
       int numFive = someNum - someJersey;
        System.out.println("Your lucky numbers are " + numOne +" "+ numTwo +" "+ numThree +" "+ numFour +" " +
                ""+ numFive +
                ". Your magic number is " + magicBall + ".");











    }
}

