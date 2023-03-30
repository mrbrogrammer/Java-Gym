package com.codegym.task.task18.task1826;

/* 
Encryption

Encryption
Come up with an encryption/decryption mechanism.

The program runs with one of the following sets of arguments:
-e fileName fileOutputName
-d fileName fileOutputName

where:
fileName is the name of a file to be encrypted/decrypted.
fileOutputName is the name of the file where you need to write the result of the encryption/decryption process.
-e indicates that you need to encrypt the data.
-d indicates that you need to decrypt the data.


Requirements:
1. You don't need to read anything from the console.
2. Create an input stream for the file passed as the second argument (fileName).
3. Create an output stream for the file passed as the third argument (fileOutputName).
4. In "-e" mode, the program should encrypt fileName and write the result to fileOutputName.
5. In "-d" mode, the program should decrypt fileName and write the result to fileOutputName.
6. The file streams must be closed.
*/

import java.io.*;
import java.util.Base64;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws IOException {
        Base64.Encoder encoder = Base64.getEncoder();
        if (Objects.equals(args[0], "-e")) {
            FileInputStream inStream = new FileInputStream(args[1]);
            BufferedWriter outStream = new BufferedWriter(new FileWriter(args[2]));
            String tmp = "";
            while (inStream.available() > 0) {
                char c = (char) inStream.read();
                
                tmp += String.valueOf(c);
            }
    
            String str = encoder.encodeToString(tmp.getBytes());
            for (int index = 0; index < str.length(); index++) {
                outStream.write(str.charAt(index));
            }
        

            inStream.close();
            outStream.close();
        } else if (Objects.equals(args[0], "-d")) {
            FileInputStream inStream = new FileInputStream(args[1]);
            BufferedWriter outStream = new BufferedWriter(new FileWriter(args[2]));
            String str = "";
            Base64.Decoder decoder = Base64.getDecoder();
    
            while (inStream.available() > 0) {
    
                char s = (char) inStream.read();
                
                
                str += String.valueOf(s);
            }
    
            String dStr = new String(decoder.decode(str));
    
            for (int index = 0; index < dStr.length(); index++) {
                outStream.write(dStr.charAt(index));
            }

          

            inStream.close();
            outStream.close();
        }
    
    }
}
