package com.AES;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.beans.Encoder;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESImplementation {
    public static SecretKey generateKey()  throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    public static String encoder(String plainText,SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[] encryptArray = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptArray);
    }

    public static String decode(String plainText,SecretKey secretKey) throws Exception{
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE,secretKey);
        byte[] decode = cipher.doFinal(Base64.getDecoder().decode(plainText));
        return new String(decode);


    }

    public static void main(String[] args) throws Exception{
        String string = "Monday";
        SecretKey secretKey = AESImplementation.generateKey();

        System.out.println("Encrypted String");
        String encrypt = AESImplementation.encoder(string,secretKey);
        System.out.println(encrypt);

        System.out.println("Decrypt String");
        System.out.println(AESImplementation.decode(encrypt,secretKey));

    }
}
