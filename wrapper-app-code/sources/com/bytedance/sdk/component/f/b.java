package com.bytedance.sdk.component.f;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.l;

/* compiled from: DelegateRunnable */
class b implements Comparable, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private g f19211a = null;

    /* renamed from: b  reason: collision with root package name */
    private a f19212b = null;

    /* renamed from: c  reason: collision with root package name */
    private long f19213c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Thread f19214d = null;

    public b(g gVar, a aVar) {
        this.f19211a = gVar;
        this.f19212b = aVar;
        this.f19213c = SystemClock.uptimeMillis();
    }

    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.f19213c;
        this.f19214d = Thread.currentThread();
        g gVar = this.f19211a;
        if (gVar != null) {
            gVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.f19212b != null) {
            d.a();
        }
        if (l.a()) {
            Object[] objArr = new Object[8];
            objArr[0] = "run: pool  = ";
            a aVar = this.f19212b;
            String str = "null";
            objArr[1] = aVar != null ? aVar.a() : str;
            objArr[2] = " waitTime =";
            objArr[3] = Long.valueOf(j);
            objArr[4] = " taskCost = ";
            objArr[5] = Long.valueOf(uptimeMillis2);
            objArr[6] = " name=";
            g gVar2 = this.f19211a;
            if (gVar2 != null) {
                str = gVar2.b();
            }
            objArr[7] = str;
            l.a("DelegateRunnable", objArr);
        }
    }

    public g a() {
        return this.f19211a;
    }

    public int compareTo(Object obj) {
        if (obj instanceof b) {
            return this.f19211a.compareTo(((b) obj).a());
        }
        return 0;
    }

    public int hashCode() {
        return this.f19211a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f19211a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.bytedance.sdk.component.f.b
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.g r0 = r1.f19211a
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.b r2 = (com.bytedance.sdk.component.f.b) r2
            com.bytedance.sdk.component.f.g r2 = r2.a()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.f.b.equals(java.lang.Object):boolean");
    }
}
