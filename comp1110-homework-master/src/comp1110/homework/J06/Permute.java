package comp1110.homework.J06;

import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        if(st1.length()==st2.length()){
            int count = 0;
            for(int i = 0;i<st1.length();i++){
                char str0 = st1.charAt(i);
                if(st2.indexOf(str0)!=-1){
                    count++;
                }else{
                    System.out.println("No");
                    break;
                }
            }if(count==st1.length()){
                System.out.println("Yes");
            }
        }else{
            System.out.println("No");
        }
    }
}
