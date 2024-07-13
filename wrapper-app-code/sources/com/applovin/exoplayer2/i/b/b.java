package com.applovin.exoplayer2.i.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f12975a = {0, 7, 8, Ascii.SI};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f12976b = {0, 119, -120, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f12977c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: d  reason: collision with root package name */
    private final Paint f12978d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f12979e;

    /* renamed from: f  reason: collision with root package name */
    private final Canvas f12980f = new Canvas();

    /* renamed from: g  reason: collision with root package name */
    private final C0129b f12981g = new C0129b(719, 575, 0, 719, 0, 575);

    /* renamed from: h  reason: collision with root package name */
    private final a f12982h = new a(0, b(), c(), d());
    private final h i;
    private Bitmap j;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12983a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f12984b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f12985c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f12986d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f12983a = i;
            this.f12984b = iArr;
            this.f12985c = iArr2;
            this.f12986d = iArr3;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$b  reason: collision with other inner class name */
    private static final class C0129b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12987a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12988b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12989c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12990d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12991e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12992f;

        public C0129b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f12987a = i;
            this.f12988b = i2;
            this.f12989c = i3;
            this.f12990d = i4;
            this.f12991e = i5;
            this.f12992f = i6;
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f12993a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12994b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12995c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f12996d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f12993a = i;
            this.f12994b = z;
            this.f12995c = bArr;
            this.f12996d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f12997a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12998b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12999c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<e> f13000d;

        public d(int i, int i2, int i3, SparseArray<e> sparseArray) {
            this.f12997a = i;
            this.f12998b = i2;
            this.f12999c = i3;
            this.f13000d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f13001a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13002b;

        public e(int i, int i2) {
            this.f13001a = i;
            this.f13002b = i2;
        }
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f13003a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13004b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13005c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13006d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13007e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13008f;

        /* renamed from: g  reason: collision with root package name */
        public final int f13009g;

        /* renamed from: h  reason: collision with root package name */
        public final int f13010h;
        public final int i;
        public final int j;
        public final SparseArray<g> k;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<g> sparseArray) {
            this.f13003a = i2;
            this.f13004b = z;
            this.f13005c = i3;
            this.f13006d = i4;
            this.f13007e = i5;
            this.f13008f = i6;
            this.f13009g = i7;
            this.f13010h = i8;
            this.i = i9;
            this.j = i10;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.k;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.k.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f13011a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13012b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13013c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13014d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13015e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13016f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f13011a = i;
            this.f13012b = i2;
            this.f13013c = i3;
            this.f13014d = i4;
            this.f13015e = i5;
            this.f13016f = i6;
        }
    }

    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f13017a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13018b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f13019c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f13020d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f13021e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f13022f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f13023g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0129b f13024h;
        public d i;

        public h(int i2, int i3) {
            this.f13017a = i2;
            this.f13018b = i3;
        }

        public void a() {
            this.f13019c.clear();
            this.f13020d.clear();
            this.f13021e.clear();
            this.f13022f.clear();
            this.f13023g.clear();
            this.f13024h = null;
            this.i = null;
        }
    }

    public b(int i2, int i3) {
        Paint paint = new Paint();
        this.f12978d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12978d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f12978d.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f12979e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f12979e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f12979e.setPathEffect((PathEffect) null);
        this.i = new h(i2, i3);
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[LOOP:0: B:1:0x0009->B:31:0x007b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(com.applovin.exoplayer2.l.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
        L_0x0012:
            r12 = 1
            goto L_0x0059
        L_0x0014:
            boolean r4 = r13.e()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.c(r6)
            int r4 = r4 + r6
        L_0x0020:
            int r3 = r13.c(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0059
        L_0x0028:
            boolean r4 = r13.e()
            if (r4 == 0) goto L_0x0031
            r11 = r2
            r4 = 0
            goto L_0x0012
        L_0x0031:
            int r4 = r13.c(r3)
            if (r4 == 0) goto L_0x0056
            if (r4 == r5) goto L_0x0052
            if (r4 == r3) goto L_0x004a
            if (r4 == r6) goto L_0x0041
            r11 = r2
            r4 = 0
        L_0x003f:
            r12 = 0
            goto L_0x0059
        L_0x0041:
            r4 = 8
            int r4 = r13.c(r4)
            int r4 = r4 + 29
            goto L_0x0020
        L_0x004a:
            r4 = 4
            int r4 = r13.c(r4)
            int r4 = r4 + 12
            goto L_0x0020
        L_0x0052:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0059
        L_0x0056:
            r4 = 0
            r11 = 1
            goto L_0x003f
        L_0x0059:
            if (r12 == 0) goto L_0x0077
            if (r8 == 0) goto L_0x0077
            if (r15 == 0) goto L_0x0061
            byte r4 = r15[r4]
        L_0x0061:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0077:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x007b
            return r10
        L_0x007b:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.b.b.a(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static C0129b a(x xVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        xVar.b(4);
        boolean e2 = xVar.e();
        xVar.b(3);
        int c2 = xVar.c(16);
        int c3 = xVar.c(16);
        if (e2) {
            int c4 = xVar.c(16);
            int c5 = xVar.c(16);
            int c6 = xVar.c(16);
            i2 = xVar.c(16);
            i4 = c5;
            i3 = c6;
            i5 = c4;
        } else {
            i4 = c2;
            i2 = c3;
            i5 = 0;
            i3 = 0;
        }
        return new C0129b(c2, c3, i5, i4, i3, i2);
    }

    private static d a(x xVar, int i2) {
        int c2 = xVar.c(8);
        int c3 = xVar.c(4);
        int c4 = xVar.c(2);
        xVar.b(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int c5 = xVar.c(8);
            xVar.b(8);
            i3 -= 6;
            sparseArray.put(c5, new e(xVar.c(16), xVar.c(16)));
        }
        return new d(c2, c3, c4, sparseArray);
    }

    private static void a(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? aVar.f12986d : i2 == 2 ? aVar.f12985c : aVar.f12984b;
        int i5 = i2;
        int i6 = i3;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        a(cVar.f12995c, iArr, i5, i6, i4, paint2, canvas2);
        a(cVar.f12996d, iArr, i5, i6, i4 + 1, paint2, canvas2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r7.put(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.applovin.exoplayer2.l.x r6, com.applovin.exoplayer2.i.b.b.h r7) {
        /*
            r0 = 8
            int r0 = r6.c(r0)
            r1 = 16
            int r2 = r6.c(r1)
            int r1 = r6.c(r1)
            int r3 = r6.c()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.a()
            if (r4 <= r5) goto L_0x002c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            com.applovin.exoplayer2.l.q.c(r7, r0)
            int r7 = r6.a()
            r6.b(r7)
            return
        L_0x002c:
            switch(r0) {
                case 16: goto L_0x0097;
                case 17: goto L_0x0070;
                case 18: goto L_0x0055;
                case 19: goto L_0x003d;
                case 20: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00c1
        L_0x0031:
            int r0 = r7.f13017a
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$b r0 = a(r6)
            r7.f13024h = r0
            goto L_0x00c1
        L_0x003d:
            int r0 = r7.f13017a
            if (r2 != r0) goto L_0x004a
            com.applovin.exoplayer2.i.b.b$c r0 = b(r6)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$c> r7 = r7.f13021e
        L_0x0047:
            int r1 = r0.f12993a
            goto L_0x0061
        L_0x004a:
            int r0 = r7.f13018b
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$c r0 = b(r6)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$c> r7 = r7.f13023g
            goto L_0x0047
        L_0x0055:
            int r0 = r7.f13017a
            if (r2 != r0) goto L_0x0065
            com.applovin.exoplayer2.i.b.b$a r0 = c(r6, r1)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$a> r7 = r7.f13020d
        L_0x005f:
            int r1 = r0.f12983a
        L_0x0061:
            r7.put(r1, r0)
            goto L_0x00c1
        L_0x0065:
            int r0 = r7.f13018b
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$a r0 = c(r6, r1)
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$a> r7 = r7.f13022f
            goto L_0x005f
        L_0x0070:
            com.applovin.exoplayer2.i.b.b$d r0 = r7.i
            int r4 = r7.f13017a
            if (r2 != r4) goto L_0x00c1
            if (r0 == 0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$f r1 = b(r6, r1)
            int r0 = r0.f12999c
            if (r0 != 0) goto L_0x008f
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$f> r0 = r7.f13019c
            int r2 = r1.f13003a
            java.lang.Object r0 = r0.get(r2)
            com.applovin.exoplayer2.i.b.b$f r0 = (com.applovin.exoplayer2.i.b.b.f) r0
            if (r0 == 0) goto L_0x008f
            r1.a(r0)
        L_0x008f:
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$f> r7 = r7.f13019c
            int r0 = r1.f13003a
            r7.put(r0, r1)
            goto L_0x00c1
        L_0x0097:
            int r0 = r7.f13017a
            if (r2 != r0) goto L_0x00c1
            com.applovin.exoplayer2.i.b.b$d r0 = r7.i
            com.applovin.exoplayer2.i.b.b$d r1 = a((com.applovin.exoplayer2.l.x) r6, (int) r1)
            int r2 = r1.f12999c
            if (r2 == 0) goto L_0x00b7
            r7.i = r1
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$f> r0 = r7.f13019c
            r0.clear()
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$a> r0 = r7.f13020d
            r0.clear()
            android.util.SparseArray<com.applovin.exoplayer2.i.b.b$c> r7 = r7.f13021e
            r7.clear()
            goto L_0x00c1
        L_0x00b7:
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.f12998b
            int r2 = r1.f12998b
            if (r0 == r2) goto L_0x00c1
            r7.i = r1
        L_0x00c1:
            int r7 = r6.c()
            int r3 = r3 - r7
            r6.e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.b.b.a(com.applovin.exoplayer2.l.x, com.applovin.exoplayer2.i.b.b$h):void");
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i5 = i2;
        byte[] bArr5 = bArr;
        x xVar = new x(bArr);
        int i6 = i3;
        int i7 = i4;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (xVar.a() != 0) {
            int c2 = xVar.c(8);
            if (c2 != 240) {
                switch (c2) {
                    case 16:
                        if (i5 != 3) {
                            if (i5 != 2) {
                                bArr2 = null;
                                i6 = a(xVar, iArr, bArr2, i6, i7, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr8 == null ? f12975a : bArr8;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f12976b : bArr6;
                        }
                        bArr2 = bArr3;
                        i6 = a(xVar, iArr, bArr2, i6, i7, paint, canvas);
                    case 17:
                        if (i5 == 3) {
                            bArr4 = bArr7 == null ? f12977c : bArr7;
                        } else {
                            bArr4 = null;
                        }
                        i6 = b(xVar, iArr, bArr4, i6, i7, paint, canvas);
                        break;
                    case 18:
                        i6 = c(xVar, iArr, (byte[]) null, i6, i7, paint, canvas);
                        continue;
                    default:
                        switch (c2) {
                            case 32:
                                bArr8 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArr6 = a(4, 8, xVar);
                                break;
                            case 34:
                                bArr7 = a(16, 8, xVar);
                                break;
                            default:
                                continue;
                        }
                }
                xVar.f();
            } else {
                i7 += 2;
                i6 = i3;
            }
        }
    }

    private static byte[] a(int i2, int i3, x xVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) xVar.c(i3);
        }
        return bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085 A[LOOP:0: B:1:0x0009->B:34:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(com.applovin.exoplayer2.l.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.c(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
        L_0x0013:
            r12 = 1
            goto L_0x0065
        L_0x0015:
            boolean r4 = r13.e()
            r7 = 3
            if (r4 != 0) goto L_0x002b
            int r3 = r13.c(r7)
            if (r3 == 0) goto L_0x0028
            int r5 = r3 + 2
            r11 = r2
            r12 = r5
            r4 = 0
            goto L_0x0065
        L_0x0028:
            r4 = 0
            r11 = 1
            goto L_0x004c
        L_0x002b:
            boolean r4 = r13.e()
            if (r4 != 0) goto L_0x003e
            int r4 = r13.c(r5)
            int r5 = r4 + 4
        L_0x0037:
            int r4 = r13.c(r3)
            r11 = r2
            r12 = r5
            goto L_0x0065
        L_0x003e:
            int r4 = r13.c(r5)
            if (r4 == 0) goto L_0x0062
            if (r4 == r6) goto L_0x005e
            if (r4 == r5) goto L_0x0057
            if (r4 == r7) goto L_0x004e
            r11 = r2
            r4 = 0
        L_0x004c:
            r12 = 0
            goto L_0x0065
        L_0x004e:
            r4 = 8
            int r4 = r13.c(r4)
            int r5 = r4 + 25
            goto L_0x0037
        L_0x0057:
            int r4 = r13.c(r3)
            int r5 = r4 + 9
            goto L_0x0037
        L_0x005e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L_0x0065
        L_0x0062:
            r11 = r2
            r4 = 0
            goto L_0x0013
        L_0x0065:
            if (r12 == 0) goto L_0x0081
            if (r8 == 0) goto L_0x0081
            if (r15 == 0) goto L_0x006d
            byte r4 = r15[r4]
        L_0x006d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0081:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0085
            return r10
        L_0x0085:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.b.b.b(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static c b(x xVar) {
        int c2 = xVar.c(16);
        xVar.b(4);
        int c3 = xVar.c(2);
        boolean e2 = xVar.e();
        xVar.b(1);
        byte[] bArr = ai.f13530f;
        byte[] bArr2 = ai.f13530f;
        if (c3 == 1) {
            xVar.b(xVar.c(8) * 16);
        } else if (c3 == 0) {
            int c4 = xVar.c(16);
            int c5 = xVar.c(16);
            if (c4 > 0) {
                bArr = new byte[c4];
                xVar.b(bArr, 0, c4);
            }
            if (c5 > 0) {
                bArr2 = new byte[c5];
                xVar.b(bArr2, 0, c5);
            } else {
                bArr2 = bArr;
            }
        }
        return new c(c2, e2, bArr, bArr2);
    }

    private static f b(x xVar, int i2) {
        int i3;
        int i4;
        x xVar2 = xVar;
        int c2 = xVar2.c(8);
        xVar2.b(4);
        boolean e2 = xVar.e();
        xVar2.b(3);
        int i5 = 16;
        int c3 = xVar2.c(16);
        int c4 = xVar2.c(16);
        int c5 = xVar2.c(3);
        int c6 = xVar2.c(3);
        int i6 = 2;
        xVar2.b(2);
        int c7 = xVar2.c(8);
        int c8 = xVar2.c(8);
        int c9 = xVar2.c(4);
        int c10 = xVar2.c(2);
        xVar2.b(2);
        int i7 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i7 > 0) {
            int c11 = xVar2.c(i5);
            int c12 = xVar2.c(i6);
            int c13 = xVar2.c(i6);
            int c14 = xVar2.c(12);
            int i8 = c10;
            xVar2.b(4);
            int c15 = xVar2.c(12);
            i7 -= 6;
            if (c12 == 1 || c12 == 2) {
                i7 -= 2;
                i4 = xVar2.c(8);
                i3 = xVar2.c(8);
            } else {
                i4 = 0;
                i3 = 0;
            }
            sparseArray.put(c11, new g(c12, c13, c14, c15, i4, i3));
            c10 = i8;
            i6 = 2;
            i5 = 16;
        }
        return new f(c2, e2, c3, c4, c5, c6, c7, c8, c9, c10, sparseArray);
    }

    private static int[] b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(com.applovin.exoplayer2.l.x r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = 1
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.e()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.c(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = 0
            goto L_0x0035
        L_0x0026:
            r4 = 0
            r11 = 1
            r12 = 0
            goto L_0x0035
        L_0x002a:
            int r4 = r13.c(r6)
            int r3 = r13.c(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.b.b.c(com.applovin.exoplayer2.l.x, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static a c(x xVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        x xVar2 = xVar;
        int i8 = 8;
        int c2 = xVar2.c(8);
        xVar2.b(8);
        int i9 = 2;
        int i10 = i2 - 2;
        int[] b2 = b();
        int[] c3 = c();
        int[] d2 = d();
        while (i10 > 0) {
            int c4 = xVar2.c(i8);
            int c5 = xVar2.c(i8);
            int i11 = i10 - 2;
            int[] iArr = (c5 & 128) != 0 ? b2 : (c5 & 64) != 0 ? c3 : d2;
            if ((c5 & 1) != 0) {
                i6 = xVar2.c(i8);
                i5 = xVar2.c(i8);
                i4 = xVar2.c(i8);
                i3 = xVar2.c(i8);
                i7 = i11 - 4;
            } else {
                i4 = xVar2.c(4) << 4;
                i7 = i11 - 2;
                int c6 = xVar2.c(4) << 4;
                i3 = xVar2.c(i9) << 6;
                i6 = xVar2.c(6) << i9;
                i5 = c6;
            }
            if (i6 == 0) {
                i5 = 0;
                i4 = 0;
                i3 = KotlinVersion.MAX_COMPONENT_VALUE;
            }
            double d3 = (double) i6;
            double d4 = (double) (i5 - 128);
            double d5 = (double) (i4 - 128);
            iArr[c4] = a((byte) (255 - (i3 & KotlinVersion.MAX_COMPONENT_VALUE)), ai.a((int) (d3 + (1.402d * d4)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE), ai.a((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE), ai.a((int) (d3 + (d5 * 1.772d)), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE));
            i10 = i7;
            c2 = c2;
            i8 = 8;
            i9 = 2;
        }
        return new a(c2, b2, c3, d2);
    }

    private static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i2 & 2) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i2 & 4) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            } else {
                int i3 = 127;
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                int i5 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(KotlinVersion.MAX_COMPONENT_VALUE, i4, i5, i3);
            }
        }
        return iArr;
    }

    private static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
                int i5 = (i2 & 2) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = a(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                int i7 = 170;
                int i8 = 85;
                if (i6 == 0) {
                    int i9 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i10 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = a(KotlinVersion.MAX_COMPONENT_VALUE, i9, i10, i8 + i7);
                } else if (i6 != 8) {
                    int i11 = 43;
                    if (i6 == 128) {
                        int i12 = ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0);
                        int i13 = ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        int i14 = i11 + 127;
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = a(KotlinVersion.MAX_COMPONENT_VALUE, i12, i13, i14 + i8);
                    } else if (i6 == 136) {
                        int i15 = ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0);
                        int i16 = ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0);
                        if ((i2 & 4) == 0) {
                            i11 = 0;
                        }
                        if ((i2 & 64) == 0) {
                            i8 = 0;
                        }
                        iArr[i2] = a(KotlinVersion.MAX_COMPONENT_VALUE, i15, i16, i11 + i8);
                    }
                } else {
                    int i17 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i18 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    if ((i2 & 4) == 0) {
                        i8 = 0;
                    }
                    if ((i2 & 64) == 0) {
                        i7 = 0;
                    }
                    iArr[i2] = a(127, i17, i18, i8 + i7);
                }
            }
        }
        return iArr;
    }

    public List<com.applovin.exoplayer2.i.a> a(byte[] bArr, int i2) {
        int i3;
        SparseArray<g> sparseArray;
        x xVar = new x(bArr, i2);
        while (xVar.a() >= 48 && xVar.c(8) == 15) {
            a(xVar, this.i);
        }
        d dVar = this.i.i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0129b bVar = this.i.f13024h != null ? this.i.f13024h : this.f12981g;
        if (!(this.j != null && bVar.f12987a + 1 == this.j.getWidth() && bVar.f12988b + 1 == this.j.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f12987a + 1, bVar.f12988b + 1, Bitmap.Config.ARGB_8888);
            this.j = createBitmap;
            this.f12980f.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f13000d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f12980f.save();
            e valueAt = sparseArray2.valueAt(i4);
            f fVar = this.i.f13019c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f13001a + bVar.f12989c;
            int i6 = valueAt.f13002b + bVar.f12991e;
            this.f12980f.clipRect(i5, i6, Math.min(fVar.f13005c + i5, bVar.f12990d), Math.min(fVar.f13006d + i6, bVar.f12992f));
            a aVar = this.i.f13020d.get(fVar.f13009g);
            if (aVar == null && (aVar = this.i.f13022f.get(fVar.f13009g)) == null) {
                aVar = this.f12982h;
            }
            SparseArray<g> sparseArray3 = fVar.k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                g valueAt2 = sparseArray3.valueAt(i7);
                c cVar = this.i.f13021e.get(keyAt);
                c cVar2 = cVar == null ? this.i.f13023g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f13008f, valueAt2.f13013c + i5, i6 + valueAt2.f13014d, cVar2.f12994b ? null : this.f12978d, this.f12980f);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f13004b) {
                this.f12979e.setColor(fVar.f13008f == 3 ? aVar.f12986d[fVar.f13010h] : fVar.f13008f == 2 ? aVar.f12985c[fVar.i] : aVar.f12984b[fVar.j]);
                this.f12980f.drawRect((float) i5, (float) i6, (float) (fVar.f13005c + i5), (float) (fVar.f13006d + i6), this.f12979e);
            }
            arrayList.add(new a.C0125a().a(Bitmap.createBitmap(this.j, i5, i6, fVar.f13005c, fVar.f13006d)).a(((float) i5) / ((float) bVar.f12987a)).b(0).a(((float) i6) / ((float) bVar.f12988b), 0).a(0).b(((float) fVar.f13005c) / ((float) bVar.f12987a)).c(((float) fVar.f13006d) / ((float) bVar.f12988b)).e());
            this.f12980f.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f12980f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void a() {
        this.i.a();
    }
}
