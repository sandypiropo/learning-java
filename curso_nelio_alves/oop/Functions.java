package oop;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            scanner.close();

            int biggestNumber = max(a, b, c);
            showResult(biggestNumber);
        }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

    public static int max( int x, int y, int z){
        int bigger;
        if (x > y && x > z) {
            bigger = x;
        } else if (y > x && y > z) {
            bigger = y;
        } else {
            bigger = z;
        }
        return bigger;
    }

}