package ArrayList_LESSON;

import java.util.ArrayList;
import java.util.List;

public class Homework5 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(3);
        int self_size = 3;
        list.add("Red");
        list.add("Red1");
        list.add("Red2");
        list.add("Red3");
        list.add("Red4");
        if (list.size() > self_size && list.size() < 6){
            self_size *= 2;
        } else {
            self_size = 2 * list.size();
        }
        list.ensureCapacity(self_size);



    }

}
