package com.bytedance.sdk.component.d.c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.i;
import com.bytedance.sdk.component.d.l;
import com.bytedance.sdk.component.d.m;
import com.bytedance.sdk.component.d.q;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

/* compiled from: ImageLoader */
public class b implements m {

    /* renamed from: a  reason: collision with root package name */
    private volatile f f19020a;

    private b() {
    }

    public static m a(Context context, l lVar) {
        b bVar = new b();
        bVar.b(context, lVar);
        return bVar;
    }

    private void b(Context context, l lVar) {
        if (this.f19020a != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (lVar == null) {
            lVar = e.a(context);
        }
        this.f19020a = new f(context, lVar);
    }

    public i a(String str) {
        return new c.b(this.f19020a).c(str);
    }

    public InputStream a(String str, String str2) {
        if (this.f19020a != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.d.c.c.c.a(str);
            }
            Collection<q> a2 = this.f19020a.a();
            if (a2 != null) {
                for (q a3 : a2) {
                    byte[] bArr = (byte[]) a3.a(str2);
                    if (bArr != null) {
                        return new ByteArrayInputStream(bArr);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.d.c> b2 = this.f19020a.b();
            if (b2 != null) {
                for (com.bytedance.sdk.component.d.c a4 : b2) {
                    InputStream a5 = a4.a(str2);
                    if (a5 != null) {
                        return a5;
                    }
                }
            }
        }
        return null;
    }

    public boolean a(String str, String str2, String str3) {
        if (this.f19020a == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.d.c.c.c.a(str);
        }
        com.bytedance.sdk.component.d.c a2 = this.f19020a.a(str3);
        if (a2 != null) {
            return a2.b(str2);
        }
        return false;
    }
}
