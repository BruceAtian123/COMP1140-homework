package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int time = sc.nextInt();
        int hour = time/60;
        int minute = time%60;
        String hour1 = "";
        String minute1 = "";
        if(hour==0){
            hour1 = "";
        }else if(hour==1){
            hour1 = hour+" hour";
        }else{
            hour1 = hour+" hours";
        }
        if(minute==0){
            minute1 = "";
        }else if(minute==1){
            if(hour!=0){
                minute1 = " and "+minute+" minute";
            }else{
                minute1 = minute+" minute";
            }
        }else{
            if(hour!=0){
                minute1 = " and "+minute+" minutes";
            }else{
                minute1 = minute+" minutes";
            }
        }
        System.out.println(name+" runs for "+hour1+minute1);
    }
}
