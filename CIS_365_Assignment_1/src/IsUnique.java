
/**
 *
 * @author Matt Guzowski
 */
import java.util.ArrayList;
import java.util.HashSet;

public class IsUnique {
    public boolean IsUnique(ArrayList<String> arrList){
    HashSet mySet = new HashSet();
    for (int i = 0; i < arrList.size(); i ++){
        mySet.add(arrList.get(i));
    }
    return mySet.size() == arrList.size(); 
    }
}
