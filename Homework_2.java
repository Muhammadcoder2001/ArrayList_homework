package ArrayList_LESSON;

import java.util.ArrayList;
import java.util.Collections;

public class Homework_2 {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
        ArrayList <String> colors = new  ArrayList<>();
        list.add("White");
        list.add("Black");
        list.add("Brown");
        list.add("Pink");
        list.add("Orange");
        list.add("Green");
        list.add("Blue");


        for (String color : list){
            if (color == "White"){
                System.out.println(color);
            }
        }
        colors.addAll(list);
        System.out.println("This is list " + "\n" + list);
        System.out.println("This is colors Arraylist" + "\n" + colors);

        Collections.shuffle(colors);
        System.out.println(colors);


    }
}
