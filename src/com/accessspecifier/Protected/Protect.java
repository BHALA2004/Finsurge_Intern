package com.accessspecifier.Protected;

public class Protect extends ProtectSubclass {

    public static void hoo(){
        int character = ProtectSubclass.integer;
        ProtectSubclass.methodInPackage();
    }

}
