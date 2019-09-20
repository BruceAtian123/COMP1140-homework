package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            for(int check = 2;check<i;check++) {
                if (i % check == 0) {
                    isPrime = false;
                }
            }if (isPrime) {
                System.out.println(i);
            }
            }
        }
    }
