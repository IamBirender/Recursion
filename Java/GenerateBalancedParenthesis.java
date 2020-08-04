package Java;

import java.util.ArrayList;
import java.util.List;

public class GenerateBalancedParenthesis {
    
        static List<String> res = new ArrayList<>();
        


        public static List<String> generateBalancedParenthesis(String output, int open, int close)
        {
            if(open == 0 && close == 0)
            {
                res.add(output);
                return res;

            }

            if(open > 0)
            {
                generateBalancedParenthesis(output + '(', open -1, close);
            }

            if(close > open)
            {
                generateBalancedParenthesis(output + ')', open, close - 1);
            }

        return res;
        }


        public static void main(String[] args)
        {
            int N = 2;
            int open = 2;
            int close = 2;
            System.out.println(generateBalancedParenthesis("", open, close));
        }
    }

    
