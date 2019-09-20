package comp1110.homework.J13;

import java.util.HashMap;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String sta = "";
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.contains(" ")){
                int indexofno = str.indexOf(" ")+1;
                int n = Integer.parseInt(str.substring(indexofno,str.length()));
                sta = str.substring(0,indexofno-1);
                hmap.put(sta,n);
            }else{
                if(hmap.containsKey(str)) {
                    System.out.println(hmap.get(str));
                }else{
                    System.out.println("unknown");
                }
            }
        }
    }
}
