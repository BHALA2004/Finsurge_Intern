package com.implementation;

public class Validation {
    public Validation() {
    }
    public boolean validate (String value){
            int res;
            try {
                res = Integer.parseInt(value);
                return true;
            } catch (Exception e) {
                System.out.println("Enter Valid input:");
                return false;
            }
    }

}
