public class Hello2 {

    public static void main(String []args){



        //0~25
        for(int i=0; i<26; i++){
            if(i%3 == 0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }
            if(i%5 == 0){
                System.out.println("Buzz");
            }
            if(i%3 ==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }

        }

    }
}
