package HW5sortedList;

public class Main {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(100000);
        array.arrayAdd(array);
        array.countTimeSortArray(array);


        ArrayList list = new ArrayList(100000);
        list.listAdd(list);
        list.countTimeSortCollection(list);

    }
}
