package com.bytedance.sdk.component.d.c.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* compiled from: DefaultDecoder */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ImageView.ScaleType f19021a = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f19022b = Bitmap.Config.ARGB_4444;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap.Config f19023c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19024d;

    /* renamed from: e  reason: collision with root package name */
    private final int f19025e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView.ScaleType f19026f;

    public a(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config) {
        this.f19023c = config;
        this.f19024d = i;
        this.f19025e = i2;
        this.f19026f = scaleType;
    }

    static int a(int i, int i2, int i3, int i4) {
        double min = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        float f2 = 1.0f;
        while (true) {
            float f3 = 2.0f * f2;
            if (((double) f3) > min) {
                return (int) f2;
            }
            f2 = f3;
        }
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
        }
        if (i2 == 0) {
            return i;
        }
        double d2 = ((double) i4) / ((double) i3);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d3 = (double) i2;
            return ((double) i) * d2 < d3 ? (int) (d3 / d2) : i;
        }
        double d4 = (double) i2;
        return ((double) i) * d2 > d4 ? (int) (d4 / d2) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a1657027613264dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(java.lang.String):java.lang.String");
    }

    public Bitmap a(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f19024d == 0 && this.f19025e == 0) {
            options.inPreferredConfig = this.f19023c;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int a2 = a(this.f19024d, this.f19025e, i, i2, this.f19026f);
        int a3 = a(this.f19025e, this.f19024d, i2, i, this.f19026f);
        options.inJustDecodeBounds = false;
        options.inSampleSize = a(i, i2, a2, a3);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray == null) {
            return decodeByteArray;
        }
        if (decodeByteArray.getWidth() <= a2 && decodeByteArray.getHeight() <= a3) {
            return decodeByteArray;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a2, a3, true);
        if (createScaledBitmap != decodeByteArray) {
            decodeByteArray.recycle();
        }
        return createScaledBitmap;
    }
}
