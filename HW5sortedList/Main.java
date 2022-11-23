package HW5sortedList;

public class Main {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(500000);
        array.arrayAdd(array);
        array.countTimeSortArray(array);


        ArrayList list = new ArrayList(500000);
        list.listAdd(list);
        list.countTimeSortCollection(list);

    }
}
