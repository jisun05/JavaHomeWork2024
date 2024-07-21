package homework20240629;

import java.util.InputMismatchException;


import java.util.Scanner;

public class Homework20240629_2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Please select from the following: ");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n0. Exit");

            int select;
            try {
                select = reader.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (select == 0) {
                System.out.println("Exiting");
                break;
            }

            if (select < 1 || select > 4) {
                System.out.println("Invalid option. Please select a number between 1 and 4, or 0 to exit.");
                continue;
            }

            System.out.println("Please enter your first number:");
            String firstNumber = reader.next();
            System.out.println("Please enter your second number:");
            String secondNumber = reader.next();

            try {
                if (firstNumber.contains(".") || secondNumber.contains(".")) {
                    float num1 = Float.parseFloat(firstNumber);
                    float num2 = Float.parseFloat(secondNumber);
                    float result = 0;
                    switch (select) {
                        case 1:
                            result = calculator.add(num1, num2);
                            break;
                        case 2:
                            result = calculator.subtract(num1, num2);
                            break;
                        case 3:
                            result = calculator.multiply(num1, num2);
                            break;
                        case 4:
                            result = calculator.divide(num1, num2);
                            break;
                    }
                    System.out.println("The answer is: " + result);
                } else {
                    int num1 = Integer.parseInt(firstNumber);
                    int num2 = Integer.parseInt(secondNumber);
                    int result = 0;
                    switch (select) {
                        case 1:
                            result = calculator.add(num1, num2);
                            break;
                        case 2:
                            result = calculator.subtract(num1, num2);
                            break;
                        case 3:
                            result = calculator.multiply(num1, num2);
                            break;
                        case 4:
                            result = calculator.divide(num1, num2);
                            break;
                    }
                    System.out.println("The answer is: " + result);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter valid numbers.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
