package com.bytedance.sdk.component.d.c.a.b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.sdk.component.d.c.a.c;
import com.bytedance.sdk.component.d.p;

/* compiled from: LruCountBitmapCache */
public class b implements p {

    /* renamed from: a  reason: collision with root package name */
    private int f19000a;

    /* renamed from: b  reason: collision with root package name */
    private int f19001b;

    /* renamed from: c  reason: collision with root package name */
    private int f19002c;

    /* renamed from: d  reason: collision with root package name */
    private c<String, Bitmap> f19003d;

    public b(int i, int i2) {
        this.f19002c = i;
        this.f19000a = i2;
        this.f19003d = new c<String, Bitmap>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int b(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return b.a(bitmap);
            }
        };
    }

    public boolean a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f19003d.a(str, bitmap);
        return true;
    }

    public Bitmap a(String str) {
        return this.f19003d.a(str);
    }

    public boolean b(String str) {
        return this.f19003d.a(str) != null;
    }

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
