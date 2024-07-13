package com.bytedance.sdk.openadsdk;

public class TTImage {

    /* renamed from: a  reason: collision with root package name */
    private int f19371a;

    /* renamed from: b  reason: collision with root package name */
    private int f19372b;

    /* renamed from: c  reason: collision with root package name */
    private String f19373c;

    /* renamed from: d  reason: collision with root package name */
    private double f19374d;

    public TTImage(int i, int i2, String str, double d2) {
        this.f19374d = 0.0d;
        this.f19371a = i;
        this.f19372b = i2;
        this.f19373c = str;
        this.f19374d = d2;
    }

    public TTImage(int i, int i2, String str) {
        this(i, i2, str, 0.0d);
    }

    public int getHeight() {
        return this.f19371a;
    }

    public int getWidth() {
        return this.f19372b;
    }

    public String getImageUrl() {
        return this.f19373c;
    }

    public double getDuration() {
        return this.f19374d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r1.f19373c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValid() {
        /*
            r1 = this;
            int r0 = r1.f19371a
            if (r0 <= 0) goto L_0x0014
            int r0 = r1.f19372b
            if (r0 <= 0) goto L_0x0014
            java.lang.String r0 = r1.f19373c
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.TTImage.isValid():boolean");
    }
}
