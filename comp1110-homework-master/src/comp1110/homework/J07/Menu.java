package comp1110.homework.J07;

import java.util.Scanner;

public class Menu {
    public static int findRange(int[] array){
        int max = array[0];
        int min = array[0];
        for(int i =0;i<array.length;i++){
            max = max>array[i]?max:array[i];
            min = min<array[i]?min:array[i];
        }int range = max - min;
        return range;
    }
    public static int getMax(int[] array){
        int max = array[0];
        for(int i =0;i<array.length;i++){
            max = max>array[i]?max:array[i];
        }return max;
    }
    public static int getSecondHighest(int[] array){
        int highest,secondhighest;
        if(array[0]>array[1]){
            highest = array[0];
            secondhighest = array[1];
        }else{
            highest = array[1];
            secondhighest = array[0];
        }for(int i = 2;i<array.length;i++){
            if((array[i]<=highest)&&array[i]>secondhighest){
                secondhighest = array[i];
            }
            if(array[i]>highest){
                secondhighest = highest;
                highest = array[i];
            }
        }return secondhighest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter:");
        System.out.println("1 to find range of the scores");
        System.out.println("2 to find the maximum score");
        System.out.println("3 to find the second highest score");
        int type = sc.nextInt();
        int arsize = sc.nextInt();
        int[] arr = new int[arsize];
        for(int i = 0;i<arsize;i++){
            int number = sc.nextInt();
            arr[i] = number;
        }
        if(type==1){
            System.out.println(findRange(arr));
        }else if(type==2){
            System.out.println(getMax(arr));
        }else if(type==3){
            System.out.println(getSecondHighest(arr));
        }
    }
}