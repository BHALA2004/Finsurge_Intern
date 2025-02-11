package com.accessspecifier.Protected;

import com.accessspecifier.Default.ProtectedClassAnotherPackage;

public class ProtectSubclass extends ProtectedClassAnotherPackage {
    protected static int integer = 5;
    public static void methodInPackage(){
        System.out.println(integer);
    }

    public static void methodInDiffpackage(){
        ProtectedClassAnotherPackage.methofOfProtected();
    }
}
