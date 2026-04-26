package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String middle = sc.nextLine();
        String last = sc.nextLine();

        System.out.println(first + " " + middle.charAt(0) + ". " + last);
    }
}

