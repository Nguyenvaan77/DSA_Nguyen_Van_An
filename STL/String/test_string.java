package String;

import java.util.Scanner;

public class test_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split("",3);

        for(String word : words){
            System.out.println(word);
        }
    }
}
