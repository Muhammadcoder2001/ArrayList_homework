package ArrayList_LESSON;

import java.util.ArrayList;

public class Homework4 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList <String> result = new ArrayList<>();

        list.add("White");
        list.add("Orange");
        list.add("Black");
        list.add("Brown");
        list.add("Gray");

        colors.add("Brown");
        colors.add("Orange");
        colors.add("Black");
        colors.add("White");
        colors.add("Blue");
        int n = list.size();
        for (int i = 0; i < n; i++){
            if (list.get(i) == colors.get(i)){
                result.add("Yes");

            }        else {
                result.add("No");

            }
        }

        System.out.println(result);


    }
}
