import java.util.Arrays;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by E6410 on 23.09.2017.
 */
public class SortingStarter {
    public static void main(String[] args) {
        int[] array = createRandomIntegerArray(10);
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        InsertionSorter sorter = new InsertionSorter(array);
        Arrays.stream(sorter.sort()).forEach(System.out::print);

    }
    public static int[] createRandomIntegerArray(int length) {
        int[] array;
        array = new Random().ints(10,0,10).toArray();
        return array;
    }
}
