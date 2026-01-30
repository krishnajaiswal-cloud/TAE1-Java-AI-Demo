/*
 AI-generated base code using GitHub Copilot
 Manually modified, improved, and tested by Krishna Jaiswal
*/

// Write a Java program that accepts multiple numbers from the user
// and calculates maximum, minimum, and average with proper formatting

public class Unit1_MaxMinAverage {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int x = scanner.nextInt();

        if (x <= 0) {
            System.out.println("Please enter a positive integer for the number of elements.");
            return;
        }

        double[] numbers = new double[x];
        System.out.println("Enter " + x + " numbers:");

        for (int i = 0; i < x; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double max = numbers[0];
        double min = numbers[0];
        double sum = 0;

        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double average = sum / x;

        System.out.printf("Maximum: %.2f%n", max);
        System.out.printf("Minimum: %.2f%n", min);
        System.out.printf("Average: %.2f%n", average);

            scanner.close();
        }
    }