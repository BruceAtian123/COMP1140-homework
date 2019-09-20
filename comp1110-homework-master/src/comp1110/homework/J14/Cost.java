package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cost {
    public class Item implements Comparable<Item> {
        String name;
        int cost; // in cents
        public Item(String n, int c) {
            name = n;
            cost = c;
        }
        public String toString() {
            return name + " " + cost;
        }
        @Override
        public int compareTo(Item o) {
            if (this.cost - o.cost != 0) {
                return this.cost - o.cost;
            } else {
                return this.name.compareTo(o.name);
            }
        }
    }
    public void addItem(String name, int cost){
        Item newitem = new Item(name,cost);
        items.add(newitem);
        itemMap.put(name,newitem);
    }

    public void printCost(){
        Collections.sort(items);
        for (int i = 0;i < items.size();i++){
            System.out.println(items.get(i).name +" " +items.get(i).cost);
        }
    }
    ArrayList<Item> items = new ArrayList<Item>();
    Map<String,Item> itemMap = new HashMap<String,Item>();


    public int voucherWaste(int value){
        int ans = 0;
        int n = items.size();
        int[] up = new int[n];
        for (int i = 0;i < n;i++){
            up[i] = value / items.get(i).cost;
        }
        int[] num = new int[n];
        while (num[n - 1] <= up[n - 1]){
            int mon = 0;
            for (int i = 0;i < n;i++){
                mon += items.get(i).cost * num[i];
            }
            if (mon == value){
                return 0;
            } else if (mon < value){
                if (mon > ans){
                    ans = mon;
                }
            }
            num[0]++;
            for (int i = 0;i < n - 1;i++){
                if (num[i] > up [i]){
                    num[i + 1]++;
                    num[i] = 0;
                }
            }
        }
        return value- ans;
    }


}
