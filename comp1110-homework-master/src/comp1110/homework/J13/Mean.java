package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double s = sc.nextDouble();
            arr.add(s);
        }
        double sum = 0;
        double average = 0;
        for(int i = 0;i<arr.size();i++){
            sum += arr.get(i);
            average = sum/arr.size();
        }
        System.out.println(average);
    }
}
