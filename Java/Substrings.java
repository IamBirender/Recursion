package Java;

import java.util.ArrayList;
import java.util.List;

public class Substrings
{
    static List<List<String>> res = new ArrayList<>();

    public static List<List<String>> substrings(String str, String output) {
        List<String> sub = new ArrayList<>();
        if (str.length() == 0) {
            res.add(sub);
         return res;
        }

        substrings(output + str.charAt(0), output.substring(1));
        return substrings(output, output.substring(1));






    }


    public static void main(String[] args) {

        String s = "abc";
        System.out.println(substrings(s, ""));


        
    }
}