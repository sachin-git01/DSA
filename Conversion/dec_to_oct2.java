import java.util.* ;
import java.io.*; 
public class Solution {
	public static long decimalToOctal(int n) {

        // code here
        if(n<=7){
            return (n);
        }
        return (decimalToOctal (n/8))*(10)+(n%8);
    }
}
