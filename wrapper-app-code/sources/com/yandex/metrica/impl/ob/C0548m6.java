package com.yandex.metrica.impl.ob;

import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.m6  reason: case insensitive filesystem */
public class C0548m6 {
    public boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdir();
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.delete()) {
            return file.mkdir();
        }
        return false;
    }
}
