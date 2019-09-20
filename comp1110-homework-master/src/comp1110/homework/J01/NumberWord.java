package comp1110.homework.J01;

import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(n+", "+str);
    }
}
