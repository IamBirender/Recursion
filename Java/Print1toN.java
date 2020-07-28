package Java;


public class Print1toN
{
    public static void print1toN(int num)
    {
        
        if(num == 0)
        {
            return;
        }
        else
        
        print1toN(num -1);
        System.out.println(num);
    }
     public static void main(String[] args) {

        int num = 10;
        print1toN(num);
        
    }
        
    

}