package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            arr.add(str);
        }
        for(int i = arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i));
        }
    }
}
