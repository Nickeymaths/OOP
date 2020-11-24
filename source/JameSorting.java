interface Sort {
    void sort(int[] arr);
}

class BubbleSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}

public class JameSorting {
    private Sort obj;

    public JameSorting(Sort sort) {
        this.obj = sort;
    }

    public void sort(int[] arr) {
        obj.sort(arr);
    }
}