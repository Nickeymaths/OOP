import java.util.Arrays;

public class TestJameSorting {
    public static void main(String[] args) {
        JameSorting sorting = new JameSorting(new BubbleSort());
        int[] arr = {2,6,8,2,1,9};
        sorting.sort(arr);
        printAll(arr);
    }

    public static void printAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
