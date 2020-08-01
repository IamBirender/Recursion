package Java;

import java.util.ArrayList;
public class PermutationWithSpaces
{
   static ArrayList <String> list = new ArrayList<>();
    public static ArrayList<String> permutationWithSpaces(String input, String output)
    {

        if(input.length() == 0)
        {
            list.add(output);
            return list;

        }
        
         permutationWithSpaces(input.substring(0, input.length() -1), output);
         permutationWithSpaces(input.substring(0, input.length() - 1), input.charAt(input.length() -1)+ " "+ output);

         return list;


    }


public static void main(String[] args)
{
    String input = "abc";
    System.out.println(permutationWithSpaces(input, ""));
}

}
