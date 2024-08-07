package ArrayList_LESSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Homework_3 {

    public List cutIndexToIndex(List list, int first, int last) {
        ArrayList<String> names = new ArrayList<>();
        if (first > last) {
            System.out.println("Invalid size!!!");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i >= first && i < last) {
                names.add((String) list.get(i));
            }

        }
        return names;
    }
    public static void main(String[] args) {

        Homework_3 home = new Homework_3();

        ArrayList<String> list = new ArrayList<>();
        list.add("Abdulloh");
        list.add("MuhammadAli");
        list.add("Habibullo");
        list.add("Xafizullo");
        list.add("Zuhriddin");
        list.add("Javohir");
        System.out.println("Sample list is " + "\n" + list);
        Collections.reverse(list);
        System.out.println("Reversed list is " + "\n" + list);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first element: ");
        int firstIndex =input.nextInt();
        System.out.print("Enter second element: ");
        int lastIndex = input.nextInt();
       System.out.println(home.cutIndexToIndex(list, firstIndex, lastIndex));


    }
}
