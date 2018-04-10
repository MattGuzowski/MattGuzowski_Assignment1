
/**
 * CIS_365_Assignment_1
 *
 * @author Matt Guzowski
 */
import java.util.Arrays;
import java.util.HashSet;

public class Unique {

    public static boolean IsUnique(String[] arrList) {
        HashSet mySet = new HashSet();
        mySet.addAll(Arrays.asList(arrList));
        return mySet.size() == arrList.length;
    }
}