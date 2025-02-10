package com.AES;

import java.util.Base64;

public class BasicAESAlgo {
    public static void main(String[] args) {
        String string = "Bala";
        byte[] input = string.getBytes();
        String s = Base64.getEncoder().encodeToString(input);
        System.out.println(s);

       byte[] arr =  Base64.getDecoder().decode(s);
       String string1 = new String(arr);
        System.out.println(string1);
    }
}
