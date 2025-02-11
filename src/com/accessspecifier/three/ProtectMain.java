package com.accessspecifier.three;

import com.accessspecifier.two.ProtectedClassAnotherPackage;

public class ProtectMain {
    public static void main(String[] args) {
        Protect.hoo();

        ProtectSubclass.methodInDiffpackage();
        //Not allowed
        //ProtectedClassAnotherPackage.methofOfProtected();
    }
}
