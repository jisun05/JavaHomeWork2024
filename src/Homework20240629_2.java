import java.util.Scanner;

public class Homework20240629_2 {


    //Make a basic calculator, it should be able to do the following:
    public static void main(String []args){

        Calculator calculator = new Calculator();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please select from the following: ");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");

        int select  = reader.nextInt();
        System.out.println("User selects:" + select );

        System.out.println("Please enter your first number:" );
        String firstNumber  = reader.next();
        System.out.println(firstNumber);
            System.out.println("Please enter your second number:" );
        String secondNumber  = reader.next();

        try {
            int intValue = Integer.parseInt(firstNumber);
            int intValue2 = Integer.parseInt(secondNumber);
            int result;
            switch (select){
                case 1:
                    result = calculator.add(intValue,intValue2);
                    System.out.println("The answer is:" + result );
                    break;
                case 2:
                    result = calculator.subtract(intValue,intValue2);
                    System.out.println("The answer is:" + result );
                    break;
                case 3:
                    result = calculator.multiply(intValue,intValue2);
                    System.out.println("The answer is:" + result );
                    break;
                case 4:
                    result = calculator.divide(intValue,intValue2);
                    System.out.println("The answer is:" + result );
                    break;
            }


        } catch (NumberFormatException e1) {
            try {
                float floatValue = Float.parseFloat(firstNumber);
                float floatValue2 = Float.parseFloat(secondNumber);

                float result;
                switch (select){
                    case 1:
                        result = calculator.add(floatValue,floatValue2);
                        System.out.println("The answer is:" + result );
                        break;
                    case 2:
                        result = calculator.subtract(floatValue,floatValue2);
                        System.out.println("The answer is:" + result );
                        break;
                    case 3:
                        result = calculator.multiply(floatValue,floatValue2);
                        System.out.println("The answer is:" + result );
                        break;
                    case 4:
                        result = calculator.divide(floatValue,floatValue2);
                        System.out.println("The answer is:" + result );
                        break;
                }
            } catch (NumberFormatException e2) {
                System.out.println(firstNumber + " is neither an integer nor a float.");
            }
        }
    }
}
