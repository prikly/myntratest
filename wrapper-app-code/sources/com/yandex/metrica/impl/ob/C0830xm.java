package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.xm  reason: case insensitive filesystem */
public class C0830xm implements Cm {

    /* renamed from: a  reason: collision with root package name */
    private final C0806wm f7125a;

    C0830xm() {
        this(new C0782vm(F0.g().e()));
    }

    public Bm a(C0293c0 c0Var) {
        String str;
        String q = c0Var.q();
        if (!TextUtils.isEmpty(q)) {
            try {
                byte[] a2 = this.f7125a.a(q.getBytes("UTF-8"));
                if (a2 != null) {
                    str = Base64.encodeToString(a2, 0);
                    return new Bm(c0Var.f(str), Em.AES_VALUE_ENCRYPTION);
                }
            } catch (Throwable unused) {
            }
        }
        str = null;
        return new Bm(c0Var.f(str), Em.AES_VALUE_ENCRYPTION);
    }

    C0830xm(C0782vm vmVar) {
        this(new C0806wm("AES/CBC/PKCS5Padding", vmVar.b(), vmVar.a()));
    }

    C0830xm(C0806wm wmVar) {
        this.f7125a = wmVar;
    }

    public byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] decode = Base64.decode(bArr, 0);
            C0806wm wmVar = this.f7125a;
            wmVar.getClass();
            return wmVar.a(decode, 0, decode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
