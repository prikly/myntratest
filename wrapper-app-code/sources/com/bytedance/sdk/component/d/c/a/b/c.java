package com.bytedance.sdk.component.d.c.a.b;

import com.bytedance.sdk.component.d.q;

/* compiled from: LruCountRawCache */
public class c implements q {

    /* renamed from: a  reason: collision with root package name */
    private int f19005a;

    /* renamed from: b  reason: collision with root package name */
    private int f19006b;

    /* renamed from: c  reason: collision with root package name */
    private int f19007c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.d.c.a.c<String, byte[]> f19008d;

    public c(int i, int i2) {
        this.f19007c = i;
        this.f19005a = i2;
        this.f19008d = new com.bytedance.sdk.component.d.c.a.c<String, byte[]>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int b(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    public boolean a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f19008d.a(str, bArr);
        return true;
    }

    public byte[] a(String str) {
        return this.f19008d.a(str);
    }

    public boolean b(String str) {
        return this.f19008d.a(str) != null;
    }
}
