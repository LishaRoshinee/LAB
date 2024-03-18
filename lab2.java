package lab;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert your first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Insert your second number: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println("The sum of the two values is: " + sum);
    }
}
