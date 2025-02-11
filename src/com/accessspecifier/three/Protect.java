package com.accessspecifier.three;

public class Protect extends ProtectSubclass {

    public static void hoo(){
        int character = ProtectSubclass.integer;
        ProtectSubclass.methodInPackage();
    }

}
