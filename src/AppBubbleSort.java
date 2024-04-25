import java.util.Random;

public class AppBubbleSort {
    public static void main(String[] args) throws Exception {
        BubbleSort bs = new BubbleSort();
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(9999);
            array[i] = number;
        }
        System.out.println("Números Inteiros Sorteados sem Ordenação");
        bs.list(array);
        System.out.println("Números Inteiros Sorteados e Ordenados");
        bs.bubbleSort(array);
        bs.list(array);
    }
}
