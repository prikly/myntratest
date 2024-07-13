package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.c.c;
import com.bytedance.sdk.component.d.c.c.a;
import com.bytedance.sdk.component.d.f;
import com.bytedance.sdk.component.d.t;

/* compiled from: BytesVisitor */
public class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f19089a;

    /* renamed from: b  reason: collision with root package name */
    private f f19090b;

    public String a() {
        return "image_type";
    }

    public b(byte[] bArr, f fVar) {
        this.f19089a = bArr;
        this.f19090b = fVar;
    }

    public void a(c cVar) {
        i iVar;
        t i = cVar.i();
        cVar.a(this.f19089a.length);
        int i2 = AnonymousClass1.f19091a[i.ordinal()];
        if (i2 == 1) {
            byte[] bArr = this.f19089a;
            iVar = new m(bArr, this.f19090b, a.b(bArr));
        } else if (i2 != 3) {
            if (a.a(this.f19089a)) {
                iVar = new e(this.f19089a, this.f19090b);
            } else {
                byte[] bArr2 = this.f19089a;
                iVar = new m(bArr2, this.f19090b, a.b(bArr2));
            }
        } else if (a.a(this.f19089a)) {
            iVar = new e(this.f19089a, this.f19090b);
        } else if (this.f19090b == null) {
            iVar = new k();
        } else {
            iVar = new h(1001, "not image format", (Throwable) null);
        }
        cVar.a(iVar);
    }

    /* renamed from: com.bytedance.sdk.component.d.d.b$1  reason: invalid class name */
    /* compiled from: BytesVisitor */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19091a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.component.d.t[] r0 = com.bytedance.sdk.component.d.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19091a = r0
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.d.t.RAW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19091a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.d.t.AUTO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19091a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.component.d.t r1 = com.bytedance.sdk.component.d.t.BITMAP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.d.d.b.AnonymousClass1.<clinit>():void");
        }
    }
}
