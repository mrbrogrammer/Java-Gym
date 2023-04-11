package com.codegym.task.task21.task2101;

/* 
Determine the network address

*/

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
    
        
        byte[] bytes = new byte[ip.length];
        for (int index = 0; index < ip.length; index++) {
            bytes[index] = (byte) (ip[index] & mask[index]);
            
        }
        
        return bytes;
    }

    public static void print(byte[] bytes) {
        // let's change each in and mask to binary representation
        
        int num = Byte.MAX_VALUE;
        for (int index = 0; index < bytes.length; index++) {
    
            String string = Integer.toBinaryString(bytes[index]);
            if (Byte.toUnsignedInt(bytes[index]) > num) {
                string = Integer.toBinaryString(bytes[index] << 1);
                String result = string.substring(23, string.length() - 1);
                System.out.print(" " + result);
            } else  {
                String foramtedString = String.format("%8s", string).replace(' ', '0');
                System.out.print(" " + foramtedString);
            }
        }
        
        System.out.println();
    }
}
