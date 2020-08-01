package Java;

import java.util.HashSet;
import java.util.Set;
public class PrintUniqueSubsets
{
   static Set <String> list = new HashSet<>();
    public static HashSet<String> printAllSubsequences(String input, String output)
    {

        if(input.length() == 0)
        {
            list.add(output);
            return (HashSet<String>) list;

        }
        
         printAllSubsequences(input.substring(0, input.length() -1), output);
         printAllSubsequences(input.substring(0, input.length() - 1), input.charAt(input.length() -1)+ output);

         return (HashSet<String>) list;


    }


public static void main(String[] args)
{
    String input = "aabc";
    System.out.println(printAllSubsequences(input, ""));
}

}

