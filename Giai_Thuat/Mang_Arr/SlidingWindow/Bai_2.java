package Mang_Arr.SlidingWindow;

import java.util.*;

public class Bai_2 {
    public static void main(String[] args) {
        Map<Character, Integer> ma = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int resul = 0;
        int left = 0;
        int index = left;
        for (int i = 0; i < str.length(); ++i) {
            Integer n = ma.get(str.charAt(i));
            if(n != null){
                if(resul < i - left){
                    resul = i - left;
                }
                left = n + 1;
                index = left;
                ma.remove(str.charAt(i));
            }
            else{
                ma.put(str.charAt(i),i);
            }
            if(i == str.length()-1){
                if(n != null){
                    if(resul < i - left){
                        resul = i - left;
                    }
                    left = n + 1;
                    index = left;
                }
                else{
                    if(resul < i - left + 1){
                        resul = i -left + 1;
                    }
                }
            }
            System.out.println("left = " + left + " size = "+resul+" is " + str.substring(index,index+resul));
        }
        System.out.println(resul);
    }

}
