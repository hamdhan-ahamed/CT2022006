package Q8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] parts = input.split("!");

        System.out.println(parts[0].trim());
        System.out.println(parts[1].trim());
    }
}