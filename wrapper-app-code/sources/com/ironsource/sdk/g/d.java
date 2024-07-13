package com.ironsource.sdk.g;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9522a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9523b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9524c;

    /* renamed from: d  reason: collision with root package name */
    private String f9525d;

    /* renamed from: e  reason: collision with root package name */
    private String f9526e;

    /* renamed from: f  reason: collision with root package name */
    private int f9527f;

    /* renamed from: g  reason: collision with root package name */
    private int f9528g;

    /* renamed from: h  reason: collision with root package name */
    private int f9529h;
    private int[] i;
    private int[] j;
    private int[] k;
    private int[] l;

    public enum a {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final int f9530a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f9531b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f9532c = 3;

        static {
            f9533d = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) f9533d.clone();
        }
    }

    public enum b {
        None,
        Loaded,
        Ready,
        Failed
    }

    public enum c {
        Web,
        Native
    }

    /* renamed from: com.ironsource.sdk.g.d$d  reason: collision with other inner class name */
    public enum C0090d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        

        /* renamed from: d  reason: collision with root package name */
        public int f9547d;

        private C0090d(int i) {
            this.f9547d = i;
        }
    }

    public enum e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    public d() {
    }

    public d(boolean z, boolean z2, boolean z3, String str, String str2, int i2, int i3, int i4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.f9522a = z;
        this.f9523b = z2;
        this.f9524c = z3;
        this.f9525d = str;
        this.f9526e = str2;
        this.f9527f = i2;
        this.f9528g = i3;
        this.f9529h = i4;
        this.i = iArr;
        this.j = iArr2;
        this.k = iArr3;
        this.l = iArr4;
    }

    public boolean a() {
        return this.f9522a;
    }

    public boolean b() {
        return this.f9523b;
    }

    public boolean c() {
        return this.f9524c;
    }

    public String d() {
        return this.f9525d;
    }

    public String e() {
        return this.f9526e;
    }

    public int f() {
        return this.f9527f;
    }

    public int g() {
        return this.f9528g;
    }

    public int h() {
        return this.f9529h;
    }

    public int[] i() {
        return this.i;
    }

    public int[] j() {
        return this.j;
    }

    public int[] k() {
        return this.k;
    }

    public int[] l() {
        return this.l;
    }
}
