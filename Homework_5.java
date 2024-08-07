package ArrayList_LESSON;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework_5 {

    public List Swap(List list, int indexA, int indexB){
        String valueA = (String) list.get(indexA);
        String valueB = (String) list.get(indexB);
        String value = valueA;
        valueA = valueB;
        valueB = value;
        list.set(indexA, valueA);
        list.set(indexB, valueB);

        return list;
    }

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        Homework_5 home = new Homework_5();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter index number: ");
        int a = input.nextInt();
        System.out.println("Enter index number: ");
        int b = input.nextInt();

        list.add("Abdulloh");
        list.add("Nosirjon");
        list.add("Qobiljon");
        list.add("Abdulhay");
        list.add("Mustaqim");
        System.out.println(list);
        System.out.println(home.Swap(list, a, b));


    }
}
