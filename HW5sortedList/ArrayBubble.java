package HW5sortedList;

import java.util.Random;

public class ArrayBubble {

    private long[] a;
    private int elems;
    private int max;


    public ArrayBubble(int max) {
        this.max=max;
        a = new long[max];
        elems = 0;
    }

    public int getMax(){

        return max;
    }

    public void into(long value) {
        a[elems] = value;
        elems++;
    }

    public void arrayAdd(ArrayBubble temp){
        for (int i=0; i<temp.getMax(); i++){
            int value = new Random().nextInt();
            temp.into(value);

        }
    }

    private void toSwap(int first, int second) {
        long temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    public void bubbleSorted() {
        for (int out = elems - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
        }
    }

    public void countTimeSortArray(ArrayBubble array){
        long start = System.currentTimeMillis();
        array.bubbleSorted();
        long end = System.currentTimeMillis();
        long difference = end - start;
        System.out.println("\nВремя отработки массива методом bubbleSorted составило: " + difference + " милисек.");
    }
}

