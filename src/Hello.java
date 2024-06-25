import java.util.Scanner;

public class Hello {
    public static void main(String []args) {

        /*int [] numbers = {100, 10};

        int sum = 0;
        for (int i=0; i<numbers.length ; i++ ){

            sum = sum + numbers[i];
        }

        if(sum > 150){
            System.out.println("wow, we are rich!");
        }
        else {
            System.out.println("we need a job");
        }
        System.out.println(sum);
        */
        Scanner reader = new Scanner(System.in);
        System.out.println("what is your name? : ");
        String name = reader.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("how old are you? : ");
        int age = reader.nextInt();
        if(age < 20){
            System.out.println("congratulations!");
        }
        else{
            System.out.println("drink!");
        }

        int n = reader.nextInt();


        System.out.println("the user gave us the number : " + n);








    }







}
