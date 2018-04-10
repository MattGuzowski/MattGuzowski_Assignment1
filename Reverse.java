
/**
 * CIS_365_Assignment_1
 *
 * @author Matt Guzowski
 */
public class Reverse {

    public static String ReverseString(String str) throws Exception {
        if (str == null || str.isEmpty()) {
            throw new Exception("String cannot be null or empty.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb = sb.reverse();
        return sb.toString();
    }
}