package HW5sortedList;

import java.util.Collections;
import java.util.Random;

public class ArrayList extends java.util.ArrayList {
    private int listMax;

    public ArrayList(int listMax){
        this.listMax = listMax;
    }

    public int getListMax(){
        return listMax;
    }
    public void listAdd(ArrayList ad){
        for (int i = 0; i < ad.getListMax(); i++) {
            int value = new Random().nextInt();
            ad.add(value);
        }
    }

    public void countTimeSortCollection(ArrayList list){
        long start = System.currentTimeMillis();
        Collections.sort(list);
        long end = System.currentTimeMillis();
        long difference = end-start;
        System.out.println("\nВремя отработки sortCollections составило: "+difference+" милисек.");

    }

}
