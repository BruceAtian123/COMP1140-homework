package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0){
            String no = Integer.toBinaryString(n);
            int count = 0;
            for(int i = 0;i<no.length();){
                if(no.startsWith("1")){
                    count++;
                    no = no.substring(1);
                }else if(no.startsWith("0")){
                    no = no.substring(1);
                }
            }
            System.out.println(count);
        }
    }
}
