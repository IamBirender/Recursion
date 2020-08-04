package Java;

import java.util.ArrayList;
public class LetterCasePermutation
{
   static ArrayList <String> list = new ArrayList<>();
    public static ArrayList<String> letterCasePermutation(String input, String output)
    {

        if(input.length() == 0)
        {
            list.add(output);
            return list;

        }
        
        if(Character.isDigit(input.charAt(input.length() - 1)))
        {
            letterCasePermutation(input.substring(0, input.length() -1), input.charAt(input.length() - 1) + output);

        }

        else
        {

         letterCasePermutation(input.substring(0, input.length() -1), input.charAt(input.length() - 1) + output);
         letterCasePermutation(input.substring(0, input.length() -1), Character.toUpperCase(input.charAt(input.length() - 1)) + output);

        }

         

         return list;


    }


public static void main(String[] args)
{
    String input = "a12bc";
    System.out.println(letterCasePermutation(input, ""));
}

}
