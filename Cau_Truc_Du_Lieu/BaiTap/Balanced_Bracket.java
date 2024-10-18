package BaiTap;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {
                case '{' :   stack.push(s.charAt(i));
                    continue;
                case '(' :   stack.push(s.charAt(i));
                    continue;
                case '[' :   stack.push(s.charAt(i));
                    continue;
                case '}' :   if(stack.peek() == '{'){

                }
                    continue;
                case ']' :   if(!(stack.pop() == '[')){
                    return "NO";
                }
                    continue;
                case ')' :   if(!(stack.pop() == '(')){
                    return "NO";

                }
                default: continue;
            }
        }
        return "YES";
    }

}

public class Balanced_Bracket {
    public static void main(String[] args) {
        System.out.println(Result.isBalanced("}([[{)[]))]{){}["));
    }
}

