package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    public class Item{
        String name;
        int stock;
        int price;
        int rate;
        int reorderdays;
    }
    ArrayList<Item> items = new ArrayList<>();
    public void addItem(String name, int stock, int price){
        Item newitem = new Item();
        newitem.name = name;
        newitem.stock = stock;
        newitem.price = price;
        items.add(newitem);
    }
    public void addItem(String name, int stock, int price, int rate, int reorderdays){

        Item newitem = new Item();
        newitem.name = name;
        newitem.stock = stock;
        newitem.price = price;
        newitem.rate = rate;
        newitem.reorderdays = reorderdays;
        items.add(newitem);

    }

    public int totalStockValue(){
        int total = 0;
        int n = items.size();
        for (int i = 0;i < n;i++){
            total = total + items.get(i).price * items.get(i).stock;
        }
        return total;
    }


    public HashMap reorder(){
        Map<String,Integer> rmap = new HashMap<>();
        int n = items.size();
        for (int i = 0;i < n;i++){
            if (items.get(i).rate * items.get(i).reorderdays > items.get(i).stock){
                int add = 7 * items.get(i).rate - items.get(i).stock;
                rmap.put(items.get(i).name,add);
            }
        }
        return (HashMap) rmap;
    }


    public static void main(String[] args) {

    }
}

