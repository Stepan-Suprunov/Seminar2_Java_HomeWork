// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void bubbleSort() {
        File log = new File("log.txt");
        System.out.println("Введите длину массива для сортировки пузырьком:");
        Scanner scanner = new Scanner(System.in);
        int[] my_array = new int[scanner.nextInt()];
        System.out.println("Заполните массив:");
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(my_array));
        for (int i = 0; i < my_array.length; i++) {
            int mem;
            for (int j = 0; j < my_array.length - 1; j++) {
                if (my_array[j] > my_array[j + 1]) {
                    mem = my_array[j];
                    my_array[j] = my_array[j + 1];
                    my_array[j + 1] = mem;
                    try (FileWriter writer = new FileWriter(log, true)) {
                        writer.append(Arrays.toString(my_array));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(my_array));
    }
}
