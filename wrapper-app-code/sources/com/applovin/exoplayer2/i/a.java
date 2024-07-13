package com.applovin.exoplayer2.i;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12907a = new C0125a().a((CharSequence) "").e();
    public static final g.a<a> s = $$Lambda$a$a4kxnS2FFz5gogVYjEl9tNEZVVg.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f12908b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f12909c;

    /* renamed from: d  reason: collision with root package name */
    public final Layout.Alignment f12910d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f12911e;

    /* renamed from: f  reason: collision with root package name */
    public final float f12912f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12913g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12914h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    /* renamed from: com.applovin.exoplayer2.i.a$a  reason: collision with other inner class name */
    public static final class C0125a {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f12915a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f12916b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f12917c;

        /* renamed from: d  reason: collision with root package name */
        private Layout.Alignment f12918d;

        /* renamed from: e  reason: collision with root package name */
        private float f12919e;

        /* renamed from: f  reason: collision with root package name */
        private int f12920f;

        /* renamed from: g  reason: collision with root package name */
        private int f12921g;

        /* renamed from: h  reason: collision with root package name */
        private float f12922h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;

        public C0125a() {
            this.f12915a = null;
            this.f12916b = null;
            this.f12917c = null;
            this.f12918d = null;
            this.f12919e = -3.4028235E38f;
            this.f12920f = RecyclerView.UNDEFINED_DURATION;
            this.f12921g = RecyclerView.UNDEFINED_DURATION;
            this.f12922h = -3.4028235E38f;
            this.i = RecyclerView.UNDEFINED_DURATION;
            this.j = RecyclerView.UNDEFINED_DURATION;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = RecyclerView.UNDEFINED_DURATION;
        }

        private C0125a(a aVar) {
            this.f12915a = aVar.f12908b;
            this.f12916b = aVar.f12911e;
            this.f12917c = aVar.f12909c;
            this.f12918d = aVar.f12910d;
            this.f12919e = aVar.f12912f;
            this.f12920f = aVar.f12913g;
            this.f12921g = aVar.f12914h;
            this.f12922h = aVar.i;
            this.i = aVar.j;
            this.j = aVar.o;
            this.k = aVar.p;
            this.l = aVar.k;
            this.m = aVar.l;
            this.n = aVar.m;
            this.o = aVar.n;
            this.p = aVar.q;
            this.q = aVar.r;
        }

        public C0125a a(float f2) {
            this.f12922h = f2;
            return this;
        }

        public C0125a a(float f2, int i2) {
            this.f12919e = f2;
            this.f12920f = i2;
            return this;
        }

        public C0125a a(int i2) {
            this.f12921g = i2;
            return this;
        }

        public C0125a a(Bitmap bitmap) {
            this.f12916b = bitmap;
            return this;
        }

        public C0125a a(Layout.Alignment alignment) {
            this.f12917c = alignment;
            return this;
        }

        public C0125a a(CharSequence charSequence) {
            this.f12915a = charSequence;
            return this;
        }

        public CharSequence a() {
            return this.f12915a;
        }

        public int b() {
            return this.f12921g;
        }

        public C0125a b(float f2) {
            this.l = f2;
            return this;
        }

        public C0125a b(float f2, int i2) {
            this.k = f2;
            this.j = i2;
            return this;
        }

        public C0125a b(int i2) {
            this.i = i2;
            return this;
        }

        public C0125a b(Layout.Alignment alignment) {
            this.f12918d = alignment;
            return this;
        }

        public int c() {
            return this.i;
        }

        public C0125a c(float f2) {
            this.m = f2;
            return this;
        }

        public C0125a c(int i2) {
            this.o = i2;
            this.n = true;
            return this;
        }

        public C0125a d() {
            this.n = false;
            return this;
        }

        public C0125a d(float f2) {
            this.q = f2;
            return this;
        }

        public C0125a d(int i2) {
            this.p = i2;
            return this;
        }

        public a e() {
            return new a(this.f12915a, this.f12917c, this.f12918d, this.f12916b, this.f12919e, this.f12920f, this.f12921g, this.f12922h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            com.applovin.exoplayer2.l.a.b(bitmap);
        } else {
            com.applovin.exoplayer2.l.a.a(bitmap2 == null);
        }
        this.f12908b = charSequence2 instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence2 != null ? charSequence.toString() : null;
        this.f12909c = alignment;
        this.f12910d = alignment2;
        this.f12911e = bitmap2;
        this.f12912f = f2;
        this.f12913g = i2;
        this.f12914h = i3;
        this.i = f3;
        this.j = i4;
        this.k = f5;
        this.l = f6;
        this.m = z;
        this.n = i6;
        this.o = i5;
        this.p = f4;
        this.q = i7;
        this.r = f7;
    }

    /* access modifiers changed from: private */
    public static final a a(Bundle bundle) {
        C0125a aVar = new C0125a();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            aVar.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            aVar.a(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            aVar.b(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            aVar.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            aVar.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            aVar.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            aVar.a(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            aVar.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            aVar.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            aVar.b(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            aVar.c(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            aVar.c(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            aVar.d();
        }
        if (bundle.containsKey(a(15))) {
            aVar.d(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            aVar.d(bundle.getFloat(a(16)));
        }
        return aVar.e();
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public C0125a a() {
        return new C0125a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r2 = r4.f12911e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r3 = r5.f12911e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x009b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0013
            goto L_0x009b
        L_0x0013:
            com.applovin.exoplayer2.i.a r5 = (com.applovin.exoplayer2.i.a) r5
            java.lang.CharSequence r2 = r4.f12908b
            java.lang.CharSequence r3 = r5.f12908b
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0099
            android.text.Layout$Alignment r2 = r4.f12909c
            android.text.Layout$Alignment r3 = r5.f12909c
            if (r2 != r3) goto L_0x0099
            android.text.Layout$Alignment r2 = r4.f12910d
            android.text.Layout$Alignment r3 = r5.f12910d
            if (r2 != r3) goto L_0x0099
            android.graphics.Bitmap r2 = r4.f12911e
            if (r2 != 0) goto L_0x0034
            android.graphics.Bitmap r2 = r5.f12911e
            if (r2 != 0) goto L_0x0099
            goto L_0x003e
        L_0x0034:
            android.graphics.Bitmap r3 = r5.f12911e
            if (r3 == 0) goto L_0x0099
            boolean r2 = r2.sameAs(r3)
            if (r2 == 0) goto L_0x0099
        L_0x003e:
            float r2 = r4.f12912f
            float r3 = r5.f12912f
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            int r2 = r4.f12913g
            int r3 = r5.f12913g
            if (r2 != r3) goto L_0x0099
            int r2 = r4.f12914h
            int r3 = r5.f12914h
            if (r2 != r3) goto L_0x0099
            float r2 = r4.i
            float r3 = r5.i
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            int r2 = r4.j
            int r3 = r5.j
            if (r2 != r3) goto L_0x0099
            float r2 = r4.k
            float r3 = r5.k
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            float r2 = r4.l
            float r3 = r5.l
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            boolean r2 = r4.m
            boolean r3 = r5.m
            if (r2 != r3) goto L_0x0099
            int r2 = r4.n
            int r3 = r5.n
            if (r2 != r3) goto L_0x0099
            int r2 = r4.o
            int r3 = r5.o
            if (r2 != r3) goto L_0x0099
            float r2 = r4.p
            float r3 = r5.p
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            int r2 = r4.q
            int r3 = r5.q
            if (r2 != r3) goto L_0x0099
            float r2 = r4.r
            float r5 = r5.r
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            return r0
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Objects.hashCode(this.f12908b, this.f12909c, this.f12910d, this.f12911e, Float.valueOf(this.f12912f), Integer.valueOf(this.f12913g), Integer.valueOf(this.f12914h), Float.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Float.valueOf(this.p), Integer.valueOf(this.q), Float.valueOf(this.r));
    }
}
