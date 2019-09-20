package comp1110.homework.J05;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if(0<=grade&&grade<=49){
            System.out.println("N");
        }else if(50<=grade&&grade<=59){
            System.out.println("P");
        }else if(60<=grade&&grade<=69){
            System.out.println("C");
        }else if(70<=grade&&grade<=79){
            System.out.println("D");
        }else if(80<=grade&&grade<=100){
            System.out.println("HD");
        }else{
            System.out.println("Bad mark");
        }
    }
}
