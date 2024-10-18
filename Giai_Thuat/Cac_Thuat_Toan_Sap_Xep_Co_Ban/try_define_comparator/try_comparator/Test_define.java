package try_comparator;

import java.util.Arrays;

public class Test_define {
    public static void main(String[] args) {
        Person[] per_list = new Person[8];

        for (int i = 0; i < 8; i++) {
            per_list[i] = new Person(7 - i);
        }

        Arrays.sort(per_list);

        for (Person per : per_list){
            System.out.println(per.getAge());
        }
    }
}
