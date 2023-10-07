package Bolshakov_HW_11;

import java.util.Scanner;

public class Bolshakov_HW_11 extends ExceptionRules {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ExceptionRules Authorization = new ExceptionRules();

        System.out.println();
        System.out.print("Введіть логін: "); // accepted login - qwerty12345
        Authorization.setLogin(in.nextLine());

        System.out.println();
        System.out.print("Введіть пароль: "); // accepted password - qwerty12345
        Authorization.setPassword(in.nextLine());
        System.out.println();

        try {
            Authorization.TryToLogIn();
        } catch (AuthorizationException e) {
            System.err.println(e);
        }
    }
}
