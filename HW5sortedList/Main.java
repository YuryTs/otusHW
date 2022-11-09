package HW5sortedList;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String [] args){
        ArrayBubble array =new ArrayBubble(10);

        array.into(163);
        array.into(300);
        array.into(184);
        array.into(191);
        array.into(174);
        array.into(163);
        array.into(300);
        array.into(184);
        array.into(191);
        array.into(174);

        long start = System.currentTimeMillis();
        array.printer();
        array.bubbleSorted();
        array.printer();
        long end = System.currentTimeMillis();
        System.out.println("Время отработки: "+(end-start)+" милисек.");

    }
}
