package com.yandex.metrica.impl.ob;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.yandex.metrica.impl.ob.m7  reason: case insensitive filesystem */
class C0549m7 implements FilenameFilter {
    C0549m7(C0574n7 n7Var) {
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".dmp");
    }
}
