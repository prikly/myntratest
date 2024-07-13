package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.a7  reason: case insensitive filesystem */
public class C0250a7 implements C0564mm<File>, C0589nm<File, Z6> {
    public Object a(Object obj) {
        String a2 = L0.a((File) obj);
        if (!TextUtils.isEmpty(a2)) {
            try {
                return new Z6(a2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void b(Object obj) {
        try {
            ((File) obj).delete();
        } catch (Throwable unused) {
        }
    }
}
