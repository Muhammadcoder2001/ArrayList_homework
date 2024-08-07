package ArrayList_LESSON;

import java.util.ArrayList;

public class Homework_1 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Green");
        colors.add("Blue");

        colors.forEach(s-> {
            System.out.println(s);
        });

        colors.set(0, "Gray");
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++){
            System.out.println(i + 1 + " Element : size is " + colors.get(i).length());
        }

    }
}
