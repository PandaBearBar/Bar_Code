package G_Coral.lab2;

public class Revesrse {
    public static String reverseString (String str){
        if (str.length() == 1) return str;
        return str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
    }
}
