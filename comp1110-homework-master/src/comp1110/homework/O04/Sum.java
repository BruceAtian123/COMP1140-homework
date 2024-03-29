package comp1110.homework.O04;

import java.util.ArrayList;
import java.util.Collection;

public class Sum extends ArrayList<Integer> {

    int sum;

    public int sum(){
        int s = 0;
        int n = this.size();
        for (int i = 0; i < n;i++){
            s += this.get(i);
        }
        return s;
    }


    @Override
    public boolean add(Integer i){
        sum += i;
        return super.add(i);
    }

    @Override
    public void add(int index, Integer i){
        sum += i;
        super.add((Integer)index,i);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c){

        for (Integer i : c ){
            sum += i;
        }
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c){
        for (Integer i : c ){
            sum += i;
        }
        return super.addAll(c);
    }
}

