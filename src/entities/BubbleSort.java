package entities;

public class BubbleSort {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void list(int[] array) {
        for (int bs : array) {
            System.out.println(bs);
        }

    }
}
