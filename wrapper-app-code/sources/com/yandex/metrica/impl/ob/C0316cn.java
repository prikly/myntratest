package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.cn  reason: case insensitive filesystem */
public class C0316cn extends Sm<String> {
    public C0316cn(int i, String str) {
        this(i, str, Ul.a());
    }

    public C0316cn(int i, String str, C0315cm cmVar) {
        super(i, str, cmVar);
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (bytes.length <= super.b()) {
                return str;
            }
            String str2 = new String(bytes, 0, super.b(), "UTF-8");
            try {
                if (this.f4985c.isEnabled()) {
                    C0315cm cmVar = this.f4985c;
                    cmVar.fw("\"%s\" %s exceeded limit of %d bytes", super.a(), str, Integer.valueOf(super.b()));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
