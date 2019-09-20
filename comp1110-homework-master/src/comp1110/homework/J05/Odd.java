package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {
    public static boolean isOdd(int i){
        if(i%2==0){
            return false;
        }return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isOdd(n)==true){
            System.out.println(n+" is odd");
        }else{
            System.out.println(n+" is even");
        }
    }
}
