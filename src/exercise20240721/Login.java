package exercise20240721;

import java.util.Objects;
import java.util.Scanner;

public class Login {

    private static String username = "person1";
    private static String password = "6383257999";

    public static String djb2(String str) {
        long hash = 5381; // Initial large prime number
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            hash = ((hash << 5) + hash) + c; // hash * 33 + c
        }
        return Long.toString(hash);
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("write username");
        String user = reader.next();

        System.out.println("write password");
        String pass = reader.next();

        System.out.println(djb2(pass));
        if (Objects.equals(user, username) && Objects.equals(djb2(pass), password)) {
            System.out.println("login");
        } else {
            System.out.println("invalid");
        }


    }


}
