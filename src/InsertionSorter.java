import java.util.Arrays;

/**
 * Created by E6410 on 23.09.2017.
 */
public class InsertionSorter {

    private final int[] integers;

    public InsertionSorter(int[] integers) {
        this.integers = integers;
    }

    //<E>
    public int[] sort() {
        /*for (int i = 1; i < integers.length; i++) {
            int key = integers[i];
            int index = i - 1;
            while (index >= 0 && integers[index] > key) {
                integers[index + 1] = integers[index];
                index--;
                System.out.println("Insertion : ");
                Arrays.stream(integers).forEach(System.out::print);
                System.out.println();
            }
            integers[index + 1] = key;
        }*/
        for(int i=0; i< integers.length; i++) {
            int key = integers[i];
            int counter = i-1;
            for(int index = i-1; index>=0 && integers[index]>key; index--) {
                integers[index+1] = integers[index];
                counter--;
            }
            integers[counter+1] = key;

        }
        return integers;
    }
}
