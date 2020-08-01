package Java;

import java.util.ArrayList;

public class PrintAllSubsequence
{
   static ArrayList <String> list = new ArrayList<>();
    public static ArrayList<String> printAllSubsequences(String input, String output)
    {

        if(input.length() == 0)
        {
            list.add(output);
            return list;

        }
        
         printAllSubsequences(input.substring(0, input.length() -1), output);
         printAllSubsequences(input.substring(0, input.length() - 1), input.charAt(input.length() -1)+ output);

         return list;


    }


public static void main(String[] args)
{
    String input = "aabc";
    System.out.println(printAllSubsequences(input, ""));
}

}

