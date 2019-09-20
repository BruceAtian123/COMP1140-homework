package comp1110.homework.J04;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        String str = sc.next();
        int number = Integer.parseInt(str,b1);
        System.out.println(Integer.toString(number,b2));
    }
}
