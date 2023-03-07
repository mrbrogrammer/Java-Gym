package en.codegym.task.jdk13.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
ConsoleReader class
1. The readString method must read and return a String.
2. The readInt method must read and return an int.
3. The readDouble method must read and return a double.
4. The readBoolean method must read and return a boolean value.
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = reader.readLine();
        
        return result;
    }

    public static int readInt() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(reader.readLine());
    
        return result;
    }

    public static double readDouble() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double result = Double.parseDouble(reader.readLine());
    
        return result;
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean result = Boolean.parseBoolean(reader.readLine());
    
        return result;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(readString());
        System.out.println(readInt());
        System.out.println(readDouble());
        System.out.println(readBoolean());
    }
}
