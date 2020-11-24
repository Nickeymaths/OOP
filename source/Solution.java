import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
        double[] result = new double[a.length];
        Queue<Integer> queue1 = new PriorityQueue<Integer>((a.length + 1)/2, Collections.reverseOrder());
        Queue<Integer> queue2 = new PriorityQueue<Integer>((a.length + 1)/2);
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                queue1.add(a[i]);
                if (queue2.isEmpty()) {

                } else {
                    while (queue1.peek() > queue2.peek()) {
                        int tmp = queue1.remove();
                        queue1.add(queue2.remove());
                        queue2.add(tmp);
                    }
                }
                result[i] = (double)queue1.peek();
            } else {
                queue2.add(a[i]);
                while (queue1.peek() > queue2.peek()) {
                    int tmp = queue1.remove();
                    queue1.add(queue2.remove());
                    queue2.add(tmp);
                }
                result[i] = (double)(queue1.peek() + queue2.peek())/2;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        int[] a = {6,5,2,6,8,4,2,1,0};
        double[] result = runningMedian(a);
        print(result);
    }
}
