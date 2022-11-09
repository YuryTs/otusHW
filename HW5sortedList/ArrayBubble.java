package HW5sortedList;

import javax.xml.crypto.Data;

public class ArrayBubble {

    private long[] a;
    private int elems;

    public ArrayBubble(int max) {
        a = new long[max];
        elems = 0;
    }

    public void into(long value) {
        a[elems] = value;
        elems++;
    }

    public void printer() {
        for (int i = 0; i < elems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("____________");
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
}

