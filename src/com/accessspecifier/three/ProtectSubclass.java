package com.accessspecifier.three;

import com.accessspecifier.two.ProtectedClassAnotherPackage;

public class ProtectSubclass extends ProtectedClassAnotherPackage {
    protected static int integer = 5;
    public static void methodInPackage(){
        System.out.println(integer);
    }

    public static void methodInDiffpackage(){
        ProtectedClassAnotherPackage.methofOfProtected();
    }
}
