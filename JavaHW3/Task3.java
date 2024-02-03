package JavaHW3;

import java.util.Arrays;
import java.util.ArrayList;

public class Task3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer1 ans = new Answer1();
        ans.analyzeNumbers(arr);
    }
}

class Answer1 {
    public static void analyzeNumbers(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        int max = 0;
        int count = 0;
        double average = 0;
        for (Integer i : arr) {
            if (i > max) max = i;
        }
        int min = max;
        for (Integer i : arr) {
            if (min > i) min = i;
            average += i;
            count++;
        }
        average /= count;
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + average);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки