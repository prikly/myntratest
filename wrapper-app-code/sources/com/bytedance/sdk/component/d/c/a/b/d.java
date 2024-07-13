package com.bytedance.sdk.component.d.c.a.b;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.d.c.a.b;
import com.bytedance.sdk.component.d.p;

/* compiled from: MemoryCacheWrapper */
public class d implements p {

    /* renamed from: a  reason: collision with root package name */
    private final p f19010a;

    /* renamed from: b  reason: collision with root package name */
    private final b f19011b;

    public d(p pVar) {
        this(pVar, (b) null);
    }

    public d(p pVar, b bVar) {
        this.f19010a = pVar;
        this.f19011b = bVar;
    }

    public boolean a(String str, Bitmap bitmap) {
        boolean a2 = this.f19010a.a(str, bitmap);
        b bVar = this.f19011b;
        if (bVar != null) {
            bVar.a(str, Boolean.valueOf(a2));
        }
        return a2;
    }

    public Bitmap a(String str) {
        Bitmap bitmap = (Bitmap) this.f19010a.a(str);
        b bVar = this.f19011b;
        if (bVar != null) {
            bVar.b(str, bitmap);
        }
        return bitmap;
    }

    public boolean b(String str) {
        return this.f19010a.b(str);
    }
}
