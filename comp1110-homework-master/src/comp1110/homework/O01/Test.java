package comp1110.homework.O01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in person's name:");
        String name = sc.next();
        System.out.println("Please type in person's height:");
        double height = sc.nextDouble();
        System.out.println("Please type in person's weight:");
        double weight = sc.nextDouble();
        BMI person = new BMI(name,height,weight);
        person.toString();
    }
}
