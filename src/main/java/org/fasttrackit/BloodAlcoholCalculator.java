package org.fasttrackit;

import java.util.Scanner;

public class BloodAlcoholCalculator {

    public static void checkAlcoholLevel() {
        System.out.println("Please enter your weight:");
        double weight = new Scanner(System.in).nextDouble();

        System.out.println("Please enter your gender (m / f):");
        String gender = new Scanner(System.in).nextLine();

        System.out.println("Please enter the number of drinks you had:");
        int drinksCount = new Scanner(System.in).nextInt();

        System.out.println("Please enter the amount of alcohol per drink:");
        double alcoholAmountPerDrink = new Scanner(System.in).nextDouble();

        System.out.println("Please enter the number of hours since your last drink:");
        double hoursSinceLastDrink = new Scanner(System.in).nextDouble();

        double totalAlcoholConsumed = drinksCount * alcoholAmountPerDrink;

        // ternary operator
        double alcoholDistributionRatio = gender.equals("m") ? 0.73 : 0.66;

        // ternary above is same as:
//        double ratio;
//        if (gender.equals("m")) {
//            ratio = 0.73;
//        } else {
//            ratio = 0.66;
//        }

        double bloodAlcoholContent = (totalAlcoholConsumed * 5.14 /
                weight * alcoholDistributionRatio) - 0.015 * hoursSinceLastDrink;

        System.out.println("Your blood alcohol content is: " + bloodAlcoholContent);

        if (bloodAlcoholContent < 0.08) {
            System.out.println("It is legal for you to drive");
        } else {
            System.out.println("It is NOT legal for you to drive!");
        }
    }

    public static void main(String[] args) {
        checkAlcoholLevel();
    }

//    public static void main(String[] args) {
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(c));
//    }
}
