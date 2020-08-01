package Java;

import java.util.ArrayList;
public class PermutationWithCase
{
   static ArrayList <String> list = new ArrayList<>();
    public static ArrayList<String> permutationWithCase(String input, String output)
    {

        if(input.length() == 0)
        {
            list.add(output);
            return list;

        }
        
         permutationWithCase(input.substring(0, input.length() -1), input.charAt(input.length() - 1) + output);
         permutationWithCase(input.substring(0, input.length() -1), Character.toUpperCase(input.charAt(input.length() - 1)) + output);

         return list;


    }


public static void main(String[] args)
{
    String input = "abc";
    System.out.println(permutationWithCase(input, ""));
}

}
