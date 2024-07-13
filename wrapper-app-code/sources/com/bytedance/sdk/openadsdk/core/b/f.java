package com.bytedance.sdk.openadsdk.core.b;

import android.util.SparseArray;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TouchInfoHelper */
public class f {
    public static int j = ViewConfiguration.get(m.a()).getScaledTouchSlop();
    private static float m = 0.0f;
    private static float n = 0.0f;
    private static float o = 0.0f;
    private static float p = 0.0f;
    private static long q = 0;

    /* renamed from: a  reason: collision with root package name */
    public float f957a = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f958b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f959c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f960d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public long f961e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f962f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f963g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f964h = -1024;
    public int i = -1;
    public boolean k = true;
    public SparseArray<c.a> l = new SparseArray<>();
    private int r = 0;
    private int s = 0;

    static {
        if (ViewConfiguration.get(m.a()) != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        if (p <= ((float) r2)) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getDeviceId()
            r12.f964h = r0
            r0 = 0
            int r1 = r13.getToolType(r0)
            r12.f963g = r1
            int r1 = r13.getSource()
            r12.i = r1
            int r1 = r13.getActionMasked()
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L_0x00df
            if (r1 == r3) goto L_0x00a7
            r4 = 2
            if (r1 == r4) goto L_0x002a
            if (r1 == r2) goto L_0x0026
            r0 = -1
            r5 = -1
            goto L_0x011a
        L_0x0026:
            r0 = 4
            r5 = 4
            goto L_0x011a
        L_0x002a:
            float r1 = o
            float r2 = r13.getX()
            float r5 = m
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            o = r1
            float r1 = p
            float r2 = r13.getY()
            float r5 = n
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r1 = r1 + r2
            p = r1
            float r1 = r13.getX()
            m = r1
            float r1 = r13.getY()
            n = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r5 = q
            long r1 = r1 - r5
            r5 = 200(0xc8, double:9.9E-322)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0074
            float r1 = o
            int r2 = j
            float r5 = (float) r2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0075
            float r1 = p
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r3 = 2
        L_0x0075:
            float r1 = r13.getRawX()
            r12.f959c = r1
            float r1 = r13.getRawY()
            r12.f960d = r1
            float r1 = r12.f959c
            int r2 = r12.r
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.m.f1375a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a3
            float r1 = r12.f960d
            int r2 = r12.s
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = com.bytedance.sdk.openadsdk.core.m.f1375a
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x00a5
        L_0x00a3:
            r12.k = r0
        L_0x00a5:
            r5 = r3
            goto L_0x011a
        L_0x00a7:
            float r1 = r13.getRawX()
            r12.f959c = r1
            float r1 = r13.getRawY()
            r12.f960d = r1
            long r3 = java.lang.System.currentTimeMillis()
            r12.f962f = r3
            float r1 = r12.f959c
            int r3 = r12.r
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.m.f1375a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00db
            float r1 = r12.f960d
            int r3 = r12.s
            float r3 = (float) r3
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            int r3 = com.bytedance.sdk.openadsdk.core.m.f1375a
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x00dd
        L_0x00db:
            r12.k = r0
        L_0x00dd:
            r5 = 3
            goto L_0x011a
        L_0x00df:
            float r1 = r13.getRawX()
            int r1 = (int) r1
            r12.r = r1
            float r1 = r13.getRawY()
            int r1 = (int) r1
            r12.s = r1
            float r1 = r13.getRawX()
            r12.f957a = r1
            float r1 = r13.getRawY()
            r12.f958b = r1
            long r1 = java.lang.System.currentTimeMillis()
            r12.f961e = r1
            int r1 = r13.getToolType(r0)
            r12.f963g = r1
            int r1 = r13.getDeviceId()
            r12.f964h = r1
            int r1 = r13.getSource()
            r12.i = r1
            long r1 = java.lang.System.currentTimeMillis()
            q = r1
            r12.k = r3
            r5 = 0
        L_0x011a:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.b.c$a> r0 = r12.l
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.b.c$a r2 = new com.bytedance.sdk.openadsdk.core.b.c$a
            float r3 = r13.getSize()
            double r6 = (double) r3
            float r13 = r13.getPressure()
            double r8 = (double) r13
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r2
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.b.f.a(android.view.MotionEvent):void");
    }
}
