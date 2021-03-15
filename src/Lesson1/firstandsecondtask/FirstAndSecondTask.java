package Lesson1.firstandsecondtask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndSecondTask {
    public static void main(String[] args) {
        //Задание №1
        Character[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(arr));
        changeElements(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
        //Задание №2 -----------------------------------------------------------------------
        String[] arrayString = {"Hi", "Hello", "Good morning", "Good afternoon", "Good evening"};
        arrayToArrayList(arrayString);
    }

    public static <T> void changeElements(T[] arr, int number1, int number2) {
        T temp = arr[number1];
        arr[number1] = arr[number2];
        arr[number2] = temp;
    }

    public static <T> void arrayToArrayList(T[] arr) {
        List<T> readyArrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Arraylist = " + readyArrayList);

    }
}
