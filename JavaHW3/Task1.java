package JavaHW3;

// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел,
// реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}

class MergeSort {
    public static int[] mergeSort(int[] a) {
        int len = a.length;
        if (len < 2) {
            return a;
        }
        int center = len / 2;
        int[] l = new int[center];
        int[] r = new int[len - center];

        for (int i = 0; i < center; i++) {
            l[i] = a[i];
        }
        for (int i = center; i < len; i++) {
            r[i - center] = a[i];
        }
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);
    }

    public static int[] merge(int[] l, int[] r) {

        int left = l.length;
        int right = r.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return a;
    }
}
