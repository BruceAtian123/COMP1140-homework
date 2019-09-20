package comp1110.homework.J04;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.toUpperCase());
        int count = 0;
        for(int i = 0;i<name.length();i++){
            count++;
        }
        System.out.println(count);
    }
}
