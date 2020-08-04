package Java;
/**
 * @author Pallavi
 */
public class TowerOfHanoi
{
    /**
     * 
     * @param N - number of disks
     * @param source - source tower
     * @param destination - destination tower
     * @param helper - intermediate tower
     */

    public static void towerOfHanoi(int N, int source, int destination, int helper)
    {

    if(N==1)
    {
        System.out.println("Moving plate " + N + " from " + source +" to " + destination);
        return;

    }

    towerOfHanoi(N - 1, source, helper, destination);
    System.out.println("Moving plate " + N + " from " + source +" to " + destination);
    towerOfHanoi(N-1, helper, destination, source);

    }

/**
 * Main function 
 * 
 */
    public static void main(String[] args)
    {
    int N = 5;
    int source = 1;
    int helper = 2;
    int destination = 3;

    towerOfHanoi(N, source, destination, helper);

    }

    
}