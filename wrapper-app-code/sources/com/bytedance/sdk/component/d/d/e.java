package com.bytedance.sdk.component.d.d;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.f;

/* compiled from: DecoderVisitor */
public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f19092a;

    /* renamed from: b  reason: collision with root package name */
    private f f19093b;

    public String a() {
        return "decode";
    }

    public e(byte[] bArr, f fVar) {
        this.f19092a = bArr;
        this.f19093b = fVar;
    }

    public void a(c cVar) {
        com.bytedance.sdk.component.d.c.f p = cVar.p();
        try {
            Bitmap a2 = p.a(cVar).a(this.f19092a);
            if (a2 != null) {
                cVar.a((i) new m(a2, this.f19093b, false));
                p.a(cVar.q()).a(cVar.e(), a2);
                return;
            }
            a(1002, "decode failed bitmap null", (Throwable) null, cVar);
        } catch (Throwable th) {
            a(1002, "decode failed:" + th.getMessage(), th, cVar);
        }
    }

    private void a(int i, String str, Throwable th, c cVar) {
        if (this.f19093b == null) {
            cVar.a((i) new k());
        } else {
            cVar.a((i) new h(i, str, th));
        }
    }
}
