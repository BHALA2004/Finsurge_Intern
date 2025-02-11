package com.accessspecifier.Protected;

public class ProtectMain {
    public static void main(String[] args) {
        Protect.hoo();

        ProtectSubclass.methodInDiffpackage();
        //Not allowed
        //ProtectedClassAnotherPackage.methofOfProtected();
    }
}
