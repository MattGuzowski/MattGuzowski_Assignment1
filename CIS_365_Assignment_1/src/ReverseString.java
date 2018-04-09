/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt Guzowski
 */
public class ReverseString {
    public String ReverseString(String str) throws Exception{
        if (str == null || str.isEmpty()){
            throw new Exception("String cannot be null or empty.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb = sb.reverse();
        return sb.toString();
    }
    
}
